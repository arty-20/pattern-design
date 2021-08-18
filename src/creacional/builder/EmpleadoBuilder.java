package creacional.builder;

import util.Persona;
import creacional.builder.extra.CuentaX;
import creacional.builder.extra.CuentaY;
import creacional.builder.extra.CuentaZ;

/**
 * @author arturo
 */
public class EmpleadoBuilder implements Builder{

    private final Persona persona;
    private CuentaX cuentaX;
    private CuentaY cuentaY;
    private CuentaZ cuentaZ;

    public EmpleadoBuilder (Persona persona){
        this.persona = persona;
    }
    @Override
    public void setCuentaX(CuentaX cuentaX) {
        this.cuentaX = cuentaX;
    }

    @Override
    public void setCuentaY(CuentaY cuentaY) {
        this.cuentaY = cuentaY;
    }

    @Override
    public void setCuentaZ(CuentaZ cuentaZ) {
        this.cuentaZ = cuentaZ;
    }


    @Override
    public String getNombrePersona() {
        return persona.getNombre();
    }

    public Empleado getResult(){
        return new Empleado(persona, cuentaX, cuentaY, cuentaZ, null);

    }
}
