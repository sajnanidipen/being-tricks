import java.util.*;
import java.io.*;

public class airthmaths{
	int i,j;
	public void add1(int i, int j){
		System.out.println("Addition is:"+(i+j));
	}
	
	public void sub1(int i, int j){
		System.out.println("Subtraction is:"+(i-j));
	}
	
	public void mult1(int i, int j){
		System.out.println("Multiplication is:"+(i*j));
	}
	
	public void div1(int i, int j){
		System.out.println("Division is:"+(i/j));
	}
	
	public static void main(String args[]){
		airthmaths a1 = new airthmaths();
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Enter Two No:");
		x=sc.nextInt();
		y=sc.nextInt();
		a1.add1(x,y);
		a1.sub1(x,y);
		a1.mult1(x,y);
		a1.div1(x,y);
		
		
	}
}