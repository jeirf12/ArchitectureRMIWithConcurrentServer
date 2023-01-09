package client.services;

import client.controllers.NotifyClientCallback;
import client.utilities.RegisterClient;
import common.infra.Console;
import common.interfaces.IControllerManageNotify;
import java.rmi.RemoteException;

/**
 *
 * @author fallen
 */
public class ClientObject {
    private static IControllerManageNotify objRemoteNotify;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        int numPortRMIRegistry = 0;
        String addressIpRMIRegistry = " ";
        // Descomente estas lineas, si quiere ingresar datos por consola.
        // addressIpRMIRegistry = Console.read("Cuál es la dirección ip donde se encuentra el rmiRegistry ?", addressIpRMIRegistry, false);
        // numPortRMIRegistry = Console.read("Cuál es el numero de puerto por el cual escucha el rmiRegistry ?", numPortRMIRegistry, false);

        addressIpRMIRegistry = "localhost";
        numPortRMIRegistry = 2020;
        
        objRemoteNotify =  (IControllerManageNotify) RegisterClient.getObjectRemote(addressIpRMIRegistry, numPortRMIRegistry, "objServicioGestionNotificaciones");
        NotifyClientCallback objClientNotifyCallback = new NotifyClientCallback();
        objRemoteNotify.saveReferenceRemoteNotify(objClientNotifyCallback);
    }  
}
