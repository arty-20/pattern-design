package creacional.factorymethod;

/**
 * @author arturo
 */
public class Factory {

    public static AreaPersonal getAreaPersonal(EAreaPersonal areaPersonal){
        switch (areaPersonal) {
            case TESTING: return new Testing();
            case DESARROLLO: return new Desarrollo();
            case INFRAESTRUCTURA: return new Infraestructura();
            default: return null;
        }
    }
}
