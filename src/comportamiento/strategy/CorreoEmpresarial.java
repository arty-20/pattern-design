package comportamiento.strategy;

import creacional.builder.Empleado;

/**
 * @author arturo
 */
public class CorreoEmpresarial implements Mensajeria{

    @Override
    public void enviarMensaje(String mensaje, Empleado empleado) {
        System.out.println("EMAIL");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Destinatario: " + empleado.getNombre());
    }
}
