import java.io.*;
import java.util.*;

class Industry
{
	public void industryName()
	{
		System.out.println("Industry name: XYZ");
	}
}
class Employee extends Industry
{
	int id;
	String name ;
	double salary ;
	Scanner sc= new Scanner(System.in);
	public Employee(int a,String b,double c)
	{
		id=a;
		name=b;
		salary=c;
	}
	public void display()
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Salary:"+salary);
	}
		
}
class inherit2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id, name, salary:");
		int id = sc.nextInt();
		String nm= sc.next();
		Double sal= sc.nextDouble();
		Employee e = new Employee(id,nm,sal);
		e.display();
		e.industryName();
	}
}
		