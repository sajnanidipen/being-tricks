import java.util.*;
import java.io.*;
public class arithmatic{
	int i,j;
	public void add(int i,int j){
		System.out.println("addition is "+(i+j));
		}
	public void sub(int i,int j){
		System.out.println("substraction is"+(i-j));
		}
	public void mul(int i,int j){
		System.out.println("multiplication ="+(i*j));
		}
		public void div(int i,int j){
		System.out.println("division ="+(i/j));
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		arithmativ
		int x,y;
		System.out.println("Enter 2 numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		add(x,y);
		sub(x,y);
		mul(x,y);
		div(x,y);
		}
}