import java.io.*;
import java.util.*;
public class Circle1{
double r;
public Circle1(double r1){
r=r1;
System.out.println("The radius is"+r1);
}
public double Area(double a){
double b;
b=3.14*a*a;
return b;
}

public void Perimeter(double a){
double b;
b=2*3.14*a;
System.out.println("the perimeter is"+b);
}

public void Diameter(double a){
System.out.println("the diameter is"+(2*a));
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

double x=sc.nextDouble();
Circle1 c=new Circle1(x);
double b=c.Area(x);
System.out.println("the area is"+b);
c.Perimeter(x);
c.Diameter(x);
}
}
