package comportamiento.templatemethod;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author arturo
 */
public class RegistroAsignacionVPN {

    public void realizarRegistro(){
        try {
            FileWriter myWriter = new FileWriter("registro.txt", true);
            myWriter.write("Se realizo el registro de la copia de vpn que le fue asignada \n");
            myWriter.close();
            System.out.println("Registro añadido");
        } catch (IOException e) {
            System.out.println("Ocurrio un error con el registro");
            e.printStackTrace();
        }
    }
}
