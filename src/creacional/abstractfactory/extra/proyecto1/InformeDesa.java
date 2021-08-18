package creacional.abstractfactory.extra.proyecto1;

import creacional.abstractfactory.extra.Informe;

/**
 * @author arturo
 */
public class InformeDesa implements Informe {

    @Override
    public void getInforme() {
        System.out.println();
        System.out.println("Informe Desarrollo");
        System.out.println("Proyecto 1");
        System.out.println("Para preparar el ambiente seguir las siguientes instrucciones: ...");
        System.out.println();
    }
}
