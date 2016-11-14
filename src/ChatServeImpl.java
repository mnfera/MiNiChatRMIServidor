import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ChatServeImpl extends UnicastRemoteObject implements ChatServer {

	private static final long serialVersionUID = 1L;
	
	Map<String, ChatClient> usuario = new HashMap<String, ChatClient>();

	protected ChatServeImpl() throws RemoteException { }	

	@Override
	public void conectar(ChatClient cliente, String nickname) throws RemoteException {
		usuario.put(nickname, cliente);		
	}

	@Override
	public void desconectar(ChatClient cliente) throws RemoteException {
		usuario.remove(cliente);		
	}

	@Override
	public void falar(String nickname, String msg) throws RemoteException {
		System.out.println(usuario.get(nickname)+": "+msg);		
	}

	@Override
	public String[] naSessao() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Map<String, ChatClient> usuariosRegistrados() throws RemoteException {
		for (String key : usuario.keySet()) {
            
            //Capturamos o valor a partir da chave
            ChatClient value = usuario.get(key);
            System.out.println(key + " = " + value.nickname());
		}
		return usuario;
	}
	
}
