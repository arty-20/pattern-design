package comportamiento.templatemethod;

import creacional.prototype.ProgramVPNCustom;

/**
 * @author arturo
 */
public abstract class TempleMethod {
    private RegistroAsignacionVPN registro;

    public TempleMethod(){
        registro = new RegistroAsignacionVPN();
    }

    public void asignarVPN(ProgramVPNCustom vpn){
        doAsignarVPN(vpn);
        registro.realizarRegistro();
    }

    protected abstract void doAsignarVPN(ProgramVPNCustom vpn);
}
