package control;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Student;

public class IRemoteClientImpl extends UnicastRemoteObject implements IRemoteClient {

	protected IRemoteClientImpl() throws RemoteException {
	}

	private static final long serialVersionUID = 21L;

	@Override
	public Student getStudent() throws RemoteException {
		Student student = new Student("B20DCCN022", "Nguyen Anh Kiet", "10.0.0.254", 1);
		return student;
	}

	@Override
	public int getMax(int a, int b) throws RemoteException {
		if(a >= b) return a;
		return b;
	}

	@Override
	public int getUSCLN(int a, int b) throws RemoteException {
		if(b==0) {
			return a;
		}else {
			return getUSCLN(b, a%b);
		}
	}

	@Override
	public int getBSCNN(int a, int b) throws RemoteException {
		return a*b/getUSCLN(a, b);
	}

	@Override
	public String getReverse(String str) throws RemoteException {
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		builder.reverse();
		return builder.toString();
	}

	@Override
	public String getNormalization(String str) throws RemoteException {
		String st[] = str.trim().split("\\s+");
		String res = "";
		for(String s : st) {
			res = res + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
		}
		res = res.trim();
		return res;
	}
	

}
