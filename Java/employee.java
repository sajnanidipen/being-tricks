import java.util.*;
import java.io.*;
class industry{
	public void indusName(){
		System.out.println("Capgemini");
	}
}
public class employee extends industry{
	int id;
	float salary;
	String name;
	public employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void empDetails(){
		System.out.println("id:"+id+"\nname:"+name+"\nsalary:"+salary);
	}
	
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter emp id:");
		int i=input.nextInt();
		System.out.println("enter emp name:");
		String n=input.next();
		System.out.println("enter emp salary:");
		float s=input.nextFloat();
		employee e=new employee(i,n,s);
		e.empDetails();
		e.indusName();
		
		
	}
}