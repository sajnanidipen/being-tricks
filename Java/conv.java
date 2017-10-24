import java.rmi.*;
public interface conv extends Remote
{
public void getRate() throws RemoteException;
public float toRupees(float b) throws RemoteException;
public float toDollar(float c) throws RemoteException;
}
