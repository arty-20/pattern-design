package creacional.builder;

import creacional.builder.extra.*;

/**
 * @author arturo
 */
public interface Builder {

    void setCuentaX(CuentaX cuentaX);

    void setCuentaY(CuentaY cuentaY);

    void setCuentaZ(CuentaZ cuentaZ);

    //no se si es correcto pero necesite este metodo para mejorar el proceso
    String getNombrePersona();
}
