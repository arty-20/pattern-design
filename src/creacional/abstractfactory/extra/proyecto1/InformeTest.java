package creacional.abstractfactory.extra.proyecto1;

import creacional.abstractfactory.extra.Informe;

/**
 * @author arturo
 */
public class InformeTest implements Informe {

    @Override
    public void getInforme() {
        System.out.println("Informe Testing");
        System.out.println("Proyecto 1");
        System.out.println("Para preparar el ambiente seguir las siguientes instrucciones: ...");
    }
}
