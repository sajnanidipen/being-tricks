import java.util.*;
import java.io.*;

public class factorial1{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,a,fact=1;
		System.out.println("Enter your Number:");
		a=sc.nextInt();
		for(i=a;i>0;i--){
			fact=fact*i;
		}
		
		System.out.println("Factorial is:"+fact);
	}
}