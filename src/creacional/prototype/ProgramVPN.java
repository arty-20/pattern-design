package creacional.prototype;

/**
 * @author arturo
 */
public abstract class ProgramVPN {

    private String hostRemote;

    //ruta del archivo(certificado digital)
    private String pathCertificate;

    public ProgramVPN(){}

    public ProgramVPN(ProgramVPN vpn){
        hostRemote = vpn.getHostRemote();
        pathCertificate = vpn.getPathCertificate();
    }

    public abstract ProgramVPN clone();

    public String getHostRemote() {
        return hostRemote;
    }

    public String getPathCertificate() {
        return pathCertificate;
    }

    public void setHostRemote(String hostRemote) {
        this.hostRemote = hostRemote;
    }

    public void setPathCertificate(String pathCertificate) {
        this.pathCertificate = pathCertificate;
    }

    @Override
    public String toString() {
        return "hostRemote: " + hostRemote +
                ", pathCertificate: " + pathCertificate;
    }
}
