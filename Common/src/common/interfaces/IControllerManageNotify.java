package common.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author fallen
 */
public interface IControllerManageNotify extends Remote {
    public boolean saveReferenceRemoteNotify(INotifyClientNotificationsCallback objRefRemote) throws RemoteException;
}