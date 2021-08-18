import comportamiento.strategy.Slack;
import creacional.abstractfactory.AbstractFactory;
import creacional.abstractfactory.EProyecto;
import creacional.abstractfactory.FactoryConsumer;
import creacional.abstractfactory.extra.Informe;
import creacional.builder.Empleado;
import creacional.factorymethod.AreaPersonal;
import creacional.factorymethod.Factory;
import creacional.prototype.ProgramVPNCustom;
import creacional.singleton.CorreoSoporte;
import estructural.composite.Subtarea;
import estructural.composite.Tarea;
import estructural.decorator.CorreoEmpresarial;
import estructural.decorator.Notificador;
import estructural.decorator.SlackDecorator;
import estructural.facade.CreateUserServices;
import util.Persona;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static creacional.factorymethod.EAreaPersonal.*;

/**
 * @author arturo
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Jose");
        Persona p4 = new Persona("Lucy");
        Persona p5 = new Persona("Penny");
        Persona p6 = new Persona("Emily");

        // create user with facade
        CreateUserServices services = new CreateUserServices();
        Empleado pepe = services.createEmpleado(p1);
        Empleado juan = services.createEmpleado(p2);
        Empleado jose = services.createEmpleado(p3);
        Empleado lucy = services.createEmpleado(p4);
        Empleado penny = services.createEmpleado(p5);
        Empleado emily = services.createEmpleado(p6);


        AreaPersonal desarrollo = Factory.getAreaPersonal(DESARROLLO);
        AreaPersonal testing = Factory.getAreaPersonal(TESTING);
        AreaPersonal infraestructura = Factory.getAreaPersonal(INFRAESTRUCTURA);

        System.out.println("=========== Añadir personal ==============");
        desarrollo.añadirPersonaAUnaArea(pepe);
        desarrollo.añadirPersonaAUnaArea(emily);
        testing.añadirPersonaAUnaArea(jose);
        testing.añadirPersonaAUnaArea(lucy);
        infraestructura.añadirPersonaAUnaArea(juan);
        infraestructura.añadirPersonaAUnaArea(penny);
        System.out.println("=========== Añadir personal ==============");

        desarrollo.imprimirDatosEmpleado();
        testing.imprimirDatosEmpleado();
        infraestructura.imprimirDatosEmpleado();

        ProgramVPNCustom vpnCustom = new ProgramVPNCustom("example.com", "./Documentos");

        List<Empleado> empleados = new LinkedList<>(Arrays.asList(penny,pepe,juan,jose,emily,lucy));

        for (Empleado e: empleados){
            e.asignarVPN(vpnCustom.clone());
        }
        System.out.println("\n\nDespues de añadir la vpn a los empleados");
        empleados.forEach(e-> System.out.println(e.toString()));

        CorreoSoporte c1 = CorreoSoporte.getInstance();
        CorreoSoporte c2 = CorreoSoporte.getInstance();

        pepe.enviarCorreo(c1.getCorreo());
        lucy.enviarCorreo(c1.getCorreo());
        juan.enviarCorreo(c1.getCorreo());
        penny.enviarCorreo(c2.getCorreo());
        jose.enviarCorreo(c2.getCorreo());
        emily.enviarCorreo(c2.getCorreo());

        AbstractFactory a1 = FactoryConsumer.getFactory(EProyecto.PROYECTO1);
        AbstractFactory a2 = FactoryConsumer.getFactory(EProyecto.PROYECTO2);

        Informe i1 = a1.getInforme(DESARROLLO);
        Informe i2 = a1.getInforme(TESTING);
        Informe i3 = a1.getInforme(INFRAESTRUCTURA);
        Informe i4 = a2.getInforme(DESARROLLO);
        Informe i5 = a2.getInforme(TESTING);
        Informe i6 = a2.getInforme(INFRAESTRUCTURA);

        System.out.println("\nRepartir los siguientes informe entre el personal");
        i1.getInforme();
        i2.getInforme();
        i3.getInforme();
        i4.getInforme();
        i5.getInforme();
        i6.getInforme();

        // decorator
        System.out.println("-------------------------------------------");
        Notificador notificador = new CorreoEmpresarial();
        pepe.enviarCorreoAOtro("prueba de mensaje", penny, notificador);
        lucy.enviarCorreoAOtro(" prueba mensaje 2", jose, notificador);
        System.out.println("-------------------------------------------");

        notificador = new SlackDecorator(notificador);
        juan.enviarCorreoAOtro("prueba mensaje slack", emily, notificador);
        System.out.println("-------------------------------------------");

        // strategy
        System.out.println("===========================================");
        pepe.enviarCorreoAOtro("prueba de mensaje", penny);
        lucy.enviarCorreoAOtro(" prueba mensaje 2", jose);
        System.out.println("===========================================");

        juan.setMensajeria( new Slack());
        juan.enviarCorreoAOtro("prueba mensaje slack", emily);
        System.out.println("===========================================");



        System.out.println("=============== Composite ====================");
        Tarea t1 = new Tarea("tarea epic 1");
        Tarea t2 = new Tarea("tarea epic 2");

        Subtarea s1 = new Subtarea("sub tarea 1", "Corresponde a tarea 1", 3);
        Subtarea s2 = new Subtarea("sub tarea 2", "Corresponde a tarea 1", 5);
        Subtarea s3 = new Subtarea("sub tarea 1", "Corresponde a tarea 2", 8);
        Subtarea s4 = new Subtarea("sub tarea 2", "Corresponde a tarea 2", 2);

        t1.add(s1);
        t1.add(s2);
        t2.add(s3);
        t2.add(s4);

        Tarea tareaCompleta = new Tarea("Tarea principal");
        tareaCompleta.add(t1);
        tareaCompleta.add(t2);

        t1.getTiempo();
        System.out.println("-------------------------------------");
        t2.getTiempo();
        System.out.println("-------------------------------------");
        tareaCompleta.getTiempo();
        System.out.println("=============== Composite ====================");
    }
}
