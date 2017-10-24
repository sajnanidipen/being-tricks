import java.rmi.*;
import java.net.*;
public class helloserver
{
public static void main(String args[]) throws RemoteException,MalformedURLException
{
	RMISecurityManager rsm=(RMISecurityManager)System.getSecurityManager();
	System.setSecurityManager(rsm);
	convl c=new convl();
	Naming.rebind("rmi://localhost/k",c);
	System.out.println("Object bound");
}
}