import java.rmi.*;
import java.rmi.server.*;
public class convl extends UnicastRemoteObject implements conv
{
float x;
float y;
public convl() throws RemoteException
{
System.out.println("in conv constructor");
}
public void getRate()
{
try
	{
	System.out.println("the rate is Rs.67");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public float toRupees(float a){
try
{
	System.out.println("Enter the amount in Dollars");
	x=a;
	float d=x*67;
	return d;
}
catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
}
public float toDollar(float b)
{
try
{
	System.out.println("Enter the amount in Rupees");
	y=b;
	float d=y/67;
	return d;
}
catch(Exception e)
{
	System.out.println(e);
	return null;
}
}
}