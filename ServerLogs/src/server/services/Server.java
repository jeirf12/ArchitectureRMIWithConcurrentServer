package server.services;

import server.infra.ServerLogSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fallen
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerLogSocket server = new ServerLogSocket();
            server.start();
        } catch (Exception ex) {
             Logger.getLogger("Server").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
    }
}