import java.util.*;
import java.io.*;

public class fib{
	
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int a=0,b=1,c,sum=0,i;
			System.out.println("Enter your Number:");
			c=sc.nextInt();
			System.out.println("Printing Fibonacci...");
			System.out.print(a+" "+b+" ");
			for(i=3;i<=c;i++){
				sum=a+b;
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
			
			
	}
	
}