import java.rmi.*;
import java.net.*;
import java.util.*;
import java.io.*;
public class Client1{
	public static void main(String args[])throws RemoteException,MalformedURLException,NotBoundException{
		RMISecurityManager rsm=(RMISecurityManager)System.getSecurityManager();
		System.setSecurityManager(rsm);
		Demo d=(Demo) Naming.lookup("rmi://localhost/k");
		System.out.println(d.getRate());
		System.out.println(d.torupee(2f));
		System.out.println(d.toanyother(3f));
		
	}
}





