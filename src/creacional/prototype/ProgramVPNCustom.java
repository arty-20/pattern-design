package creacional.prototype;

/**
 * @author arturo
 */
public class ProgramVPNCustom extends ProgramVPN{

    public ProgramVPNCustom(ProgramVPN vpn) {
        super(vpn);
    }

    public ProgramVPNCustom (String hostRemote, String pathCertificate){
        super.setHostRemote(hostRemote);
        super.setPathCertificate(pathCertificate);
    }

    @Override
    public ProgramVPNCustom clone() {
        return new ProgramVPNCustom(this);
    }
}
