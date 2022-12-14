package common.interfaces;

import common.entities.IndicatorDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author fallen
 */
public interface IControllerManageSensor extends Remote {
    public boolean registerIndicator(IndicatorDTO indicator) throws RemoteException;
}