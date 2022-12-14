package common.interfaces;

import common.entities.NotifyDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author fallen
 */
public interface INotifyClientNotificationsCallback extends Remote {
    public void notifyClient(NotifyDTO notify) throws RemoteException;
}