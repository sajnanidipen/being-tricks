import java.util.*;
import java.io.*;
public class factorial{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		int a,mul=1,i;
		System.out.print("Enter a number:");
		a=sc.nextInt();
		for(i=a;i>0;i--){
			mul=mul*i;
		}
		System.out.println("Factorial:"+mul);
	}
}