import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface ChatServer extends Remote {
	
	public void conectar(ChatClient cliente, String nickname) throws RemoteException;
	
	public void desconectar(ChatClient cliente) throws RemoteException;
	
	public void falar(String nickname, String msg) throws RemoteException;
	
	public String[] naSessao() throws RemoteException;
	
	public Map<String, ChatClient> usuariosRegistrados() throws RemoteException;

}
