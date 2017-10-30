import java.util.*;
import java.io.*;

public class quad1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,e;
		System.out.println("Enter values for a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
			
		d=(b*b)-(4*a*c);
		
		if(d>1){
				
			double root1=(-b+(Math.sqrt(d))/(2*a));
			double root2=(-b-(Math.sqrt(d))/(2*a));
			System.out.println("First root is:"+root1);
			System.out.println("First root is:"+root2);
			
		}
		
		else{
			System.out.println("Roots are imaginary...");
		}
		
		
	}
	
	
}

