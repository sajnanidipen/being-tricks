import java.io.*;
import java.util.*;
public class largest{
public  double large(double i,double j,double k){
if (i>j && i>k){
return i;
}
else if (j>i && j>k){
return j;
}
else{
return k;
}

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
largest l1=new largest();
System.out.println("Enter the 3 number:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
System.out.println("Largest is "+l1.large(a,b,c));	
}
}