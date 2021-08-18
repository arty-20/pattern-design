package creacional.abstractfactory;

import creacional.abstractfactory.extra.Informe;
import creacional.factorymethod.EAreaPersonal;

/**
 * @author arturo
 */
public abstract class AbstractFactory {

    public abstract Informe getInforme(EAreaPersonal areaPersonal);
}
