package control;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
	public RMIServer() {
		try {
			IRemoteClient iRemoteClient = new IRemoteClientImpl();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("rmi://10.0.0.254:1099/IRemoteClient", iRemoteClient);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		new RMIServer();
		final String SERVER_IP = "10.0.0.254";
		final String CLIENT_IP = "10.0.0.254";
		final int RMI_PORT = 1099;
		final int SERVER_PORT = 11001;
		final String RMI_NAME = "IRemoteClient";
		final String maSV = "B20DCCN022";
		final String hovaten = "Nguyen Anh Kiet";
		final int group = 1;
		
		Socket socket = new Socket(SERVER_IP, SERVER_PORT);
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeUTF(CLIENT_IP);
		dos.writeInt(RMI_PORT);
		dos.writeUTF(RMI_NAME);
		
		dos.writeUTF(maSV);
		dos.writeUTF(hovaten);
		dos.writeInt(group);
		

	}

}
