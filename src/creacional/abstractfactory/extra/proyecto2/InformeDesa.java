package creacional.abstractfactory.extra.proyecto2;

import creacional.abstractfactory.extra.Informe;

/**
 * @author arturo
 */
public class InformeDesa implements Informe {

    @Override
    public void getInforme() {
        System.out.println("Informe Desarrollo");
        System.out.println("Proyecto 2");
        System.out.println("Para preparar el ambiente seguir las siguientes instrucciones: ...");
    }
}
