import java.util.*;
import java.io.*;
public class addition{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a,b,c=0;
	System.out.println("enter 3 digit");
	a=sc.nextInt();
	for(int i=0;i<3;i++){
	a=a%10;
	c=c+a;
	a=a%10;
	}
	System.out.println("addition = "+c);
	}
}