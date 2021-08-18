package creacional.singleton;

/**
 * @author arturo
 */
public class CorreoSoporte {

    private static CorreoSoporte correoSoporte;
    private final String correo;

    private CorreoSoporte(String correo){
        this.correo = correo;
    }

    public static CorreoSoporte getInstance(){
        if(correoSoporte == null)
            correoSoporte = new CorreoSoporte("soporte@interfase.uy");
        return correoSoporte;
    }

    public String getCorreo(){
        return correo;
    }
}
