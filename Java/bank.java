import java.util.*;
import java.io.*;

public class bank{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in); 
	int id,bal,a,amt;
	String name;
	System.out.println("enter account name, id ,bal");
	name=sc.nextLine();
	id=sc.nextInt();
	bal=sc.nextInt();
	
	System.out.println("enter 1=credit , 2=debit : ");
	a=sc.nextInt();
	System.out.println("enter the amount");
	amt=sc.nextInt();
	switch (a){
	case 1:
	System.out.println(" Bank balance = "+(bal+amt));
	case 2:
	System.out.println(" Bank balance = "+(bal-amt));
	default:
	System.out.println("Invalid option")
	}
	
}