import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ChatClientImpl extends UnicastRemoteObject implements ChatClient {

	protected ChatClientImpl() throws RemoteException {		
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Scanner ler;
	String nome;
	
	public void nome() throws RemoteException {
		ler = new Scanner( System.in );		
		System.out.print("Pro favor, informe seu nickname: ");
		nome = ler.nextLine();		
	}

	@Override
	public void disse(String nickname, String msg) throws RemoteException {
		System.out.println(nickname+": "+msg);		
	}

	@Override
	public void evento(String msg) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	public ChatServer servidor() throws RemoteException {
		ChatServer servidor = new ChatServeImpl();
		return servidor;		
	}
	
	public String nickname() throws RemoteException {		
		return nome;		
	}

}
