import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClient extends Remote {
	
	public void nome() throws RemoteException;
	
	public void disse(String nickname, String msg) throws RemoteException;
	
	public void evento(String msg) throws RemoteException;
	
	public ChatServer servidor() throws RemoteException;
	
	public String nickname() throws RemoteException;
	
}
