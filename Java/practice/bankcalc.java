import java.util.*;
import java.io.*;

public class bankcalc{
	public static void main(String args[]){
			
		Scanner sc=new Scanner(System.in);
		int bal, opt, amt;
		
		System.out.println("Enter your Balance");
		bal=sc.nextInt();
		
		System.out.println("Enter 1=credit & 0=debit");
		opt=sc.nextInt();
		
		System.out.println("Enter the amount you would like to Debit/Credit");
		amt=sc.nextInt();
		
		switch(opt){
			case 1:
				System.out.println("Your Account is Credited:"+(bal+amt));
				break;
			
			
			case 0:
				System.out.println("Your Account is Debited:"+(bal-amt));
				break;
			
			
			default:
				System.out.println("Invalid Choice");
			
			
		}
		
		}
}