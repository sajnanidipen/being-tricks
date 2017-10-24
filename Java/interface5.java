import java.util.*;
import java.io.*;
interface shape{
    public void area();
}
class circle implements shape{
    public void area(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter radius:");
     double a=sc.nextDouble();
     double b=3.14*a*a;
     System.out.println("Area of circle is "+b);   
    }
}
class rectangle implements shape{
    public void area(){
     Scanner sc=new Scanner(System.in);
          System.out.println("enter length and breadth");
     double a=sc.nextDouble();
     double c=sc.nextDouble();
     double b=a*c;
     System.out.println("Area of rectangle is "+b);   
    }
}
class triangle implements shape{
    public void area(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter base and height");
     double a=sc.nextDouble();
     double c=sc.nextDouble();
     double b=0.5*a*c;
     System.out.println("Area of triangle is "+b);   
    }
public static void main(String args[]){
    circle c=new circle();
    rectangle r=new rectangle();
    triangle t=new triangle();
    c.area();
    r.area();
    t.area();
}
}