package creacional.builder.extra;

/**
 * @author arturo
 */
public abstract class Cuenta {
    private String host;
    private String user;
    private String password;

    public Cuenta(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "host: " + host +
                ", user: " + user +
                ", password: " + password;
    }
}
