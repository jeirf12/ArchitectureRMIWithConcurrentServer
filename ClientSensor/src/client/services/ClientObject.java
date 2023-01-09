package client.services;

import client.utilities.RegisterClient;
import client.view.MenuClient;
import common.infra.Console;
import common.interfaces.IControllerManageSensor;

/**
 *
 * @author fallen
 */
public class ClientObject {
    private static IControllerManageSensor objRemoteSensor;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPortRMIRegistry = 0;
        String addressIpRMIRegistry = "";
        // Descomente estas lineas, si quiere ingresar datos por consola.
        // addressIpRMIRegistry = Console.read("Cuál es la dirección ip donde se encuentra el rmiregistry ?", addressIpRMIRegistry, false);
        // numPortRMIRegistry = Console.read("Cuál es el numero de puerto por el cual escucha el rmiregistry ?", numPortRMIRegistry, false);

        addressIpRMIRegistry = "localhost";
        numPortRMIRegistry = 2020;

        objRemoteSensor = (IControllerManageSensor) RegisterClient.getObjectRemote(addressIpRMIRegistry, numPortRMIRegistry, "objServicioGestionSensor");
        MenuClient objMenu = new MenuClient("          === Menu ===          ", new String[]{"Ingresar y enviar datos del sensor"}, objRemoteSensor);
    }  
}
