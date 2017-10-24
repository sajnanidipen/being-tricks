import java.io.*;
import java.util.*;
public class Eopn{
	public static void main(String args[]){
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	a=sc.nextInt();
	if(a%2==0){
	
		if(a<0){
			System.out.print("Number is even and negative");}
		else{
			System.out.print(" Number is even and positive");}
			}
	else if(a%2!=0){
		System.out.println("Number is odd");
		if(a<0){
			System.out.print(" and negative");}
		else{
			System.out.print(" and positive");}
		}
	else{System.out.println("number is zero");}
	}
	}