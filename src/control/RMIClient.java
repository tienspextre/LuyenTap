package control;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

	public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        IRemoteClient i = (IRemoteClient) Naming.lookup("rmi://10.0.0.254:1099/IRemoteClient");
        System.out.println(i.getReverse("Nguyen Anh Kiet"));
    }

}
