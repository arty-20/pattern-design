package creacional.builder;

import util.Persona;
import comportamiento.observer.Observer;
import comportamiento.strategy.CorreoEmpresarial;
import comportamiento.strategy.Mensajeria;
import comportamiento.templatemethod.TempleMethod;
import creacional.builder.extra.*;
import creacional.prototype.ProgramVPNCustom;
import estructural.decorator.Notificador;

/**
 * @author arturo
 */
public class Empleado extends TempleMethod implements Observer {
    private Persona persona;
    private CuentaX cuentaX;
    private CuentaY cuentaY;
    private CuentaZ cuentaZ;
    private ProgramVPNCustom vpnCustom;
    private Mensajeria mensajeria;

    public Empleado(Persona persona, CuentaX cuentaX, CuentaY cuentaY, CuentaZ cuentaZ, ProgramVPNCustom vpnCustom) {
        this.persona = persona;
        this.cuentaX = cuentaX;
        this.cuentaY = cuentaY;
        this.cuentaZ = cuentaZ;
        this.vpnCustom = vpnCustom;
    }

    @Override
    protected void doAsignarVPN(ProgramVPNCustom vpn) {
        this.vpnCustom = vpn;
    }

    @Override
    public String toString() {
        return persona + "\n" +
                "cuentaX ->" + cuentaX + "\n" +
                "cuentaY ->" + cuentaY + "\n" +
                "cuentaZ ->" + cuentaZ + "\n" +
                "vpnCustom ->" + vpnCustom+
                "\n---------------------------";
    }

    public void enviarCorreo(String correo){
        System.out.println(persona.getNombre()+" envio un correo a: " + correo);
    }

    public void enviarCorreoAOtro(String mensaje, Empleado empleado, Notificador notificador){
        notificador.enviarMensaje(mensaje, empleado);
    }

    public void enviarCorreoAOtro(String mensaje, Empleado empleado){
        if (mensajeria == null)
            mensajeria = new CorreoEmpresarial();
        mensajeria.enviarMensaje(mensaje, empleado);
    }

    public void setMensajeria(Mensajeria mensajeria){
        this.mensajeria = mensajeria;
    }



    public String getNombre(){
        return persona.getNombre();
    }

    @Override
    public void update(Empleado value) {
        System.out.println("Bienvenido " + value.getNombre() + " !!!!");
    }

}
