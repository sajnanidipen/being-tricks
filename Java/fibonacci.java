import java.util.*;
import java.io.*;
public class fibonacci{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c,sum=0,i;
	System.out.println("enter how many number you want:");
	c=sc.nextInt();
	System.out.println("fibonacci series");
	System.out.print(a+" "+b+" ");
	//System.out.println(b);
	for(i=3;i<=c;i++){
		sum =a+b;
		System.out.print(sum+" ");
		a=b;
		b=sum;
	}
    }
}