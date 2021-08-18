package creacional.builder;

import creacional.builder.extra.CuentaX;
import creacional.builder.extra.CuentaY;
import creacional.builder.extra.CuentaZ;

/**
 * @author arturo
 */
public class Director {

    public void construct1(Builder builder){
        builder.setCuentaX(new CuentaX("hostX", "user" + builder.getNombrePersona(), "1234"));
        builder.setCuentaY(new CuentaY("hostY", "user" + builder.getNombrePersona(), "1234"));
        builder.setCuentaZ(new CuentaZ("hostZ", "user" + builder.getNombrePersona(), "1234"));
    }

    public void construct2(Builder builder){
        builder.setCuentaX(new CuentaX("hostX", "user" + builder.getNombrePersona(), "1234"));
    }

    public void construct3(Builder builder){
        builder.setCuentaX(new CuentaX("hostX", "user" + builder.getNombrePersona(), "1234"));
        builder.setCuentaZ(new CuentaZ("hostZ", "user" + builder.getNombrePersona(), "1234"));
    }

    public void construct4(Builder builder){
        builder.setCuentaX(new CuentaX("hostX", "user" + builder.getNombrePersona(), "1234"));
        builder.setCuentaY(new CuentaY("hostY", "user" + builder.getNombrePersona(), "1234"));
    }
}
