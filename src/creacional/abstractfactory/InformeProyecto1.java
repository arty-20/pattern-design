package creacional.abstractfactory;

import creacional.abstractfactory.extra.Informe;
import creacional.abstractfactory.extra.proyecto1.*;
import creacional.factorymethod.EAreaPersonal;

/**
 * @author arturo
 */
public class InformeProyecto1 extends AbstractFactory{

    @Override
    public Informe getInforme(EAreaPersonal areaPersonal) {
        switch (areaPersonal){
            case TESTING: return new InformeTest();
            case DESARROLLO: return new InformeDesa();
            case INFRAESTRUCTURA: return new InformeInfra();
            default: return null;
        }
    }
}
