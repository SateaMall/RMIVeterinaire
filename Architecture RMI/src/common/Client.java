package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote{
	public void alertClient(String msg) throws RemoteException;
}
