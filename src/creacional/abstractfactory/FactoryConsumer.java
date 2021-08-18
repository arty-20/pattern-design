package creacional.abstractfactory;

/**
 * @author arturo
 */
public class FactoryConsumer {

    public static AbstractFactory getFactory(EProyecto proyecto){
        switch (proyecto) {
            case PROYECTO1:
                return new InformeProyecto1();
            case PROYECTO2:
                return new InformeProyecto2();
            default:
                return null;
        }
    }
}
