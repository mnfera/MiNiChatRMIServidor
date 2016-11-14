import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Conecta {

	public static void main(String[] args) {
 
		try {
 
			LocateRegistry.createRegistry(1099);
			ChatClient conecta = new ChatClientImpl();
			Naming.rebind("//localhost/chat", conecta);
			System.out.println("Chat iniciado.");
 
		} catch (RemoteException e) {
 
			e.printStackTrace();
 
		} catch (MalformedURLException e) {
 
			e.printStackTrace();
		}
	}
}
