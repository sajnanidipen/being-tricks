import java.io.*;
import java.util.*;

class shape
{
	public void shapeOfObject()
	{
		System.out.println("Shape of object : Circle");
	}
}
class circle extends shape
{
	public void areaOfCircle(double r)
	{
		System.out.println("Area of circle :"+(3.14*r*r));
	}
	public void circum(double r)
	{
		System.out.println("Circumference of circle:"+(2*3.14*r));
	}
}
class inherit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		circle c= new circle();
		System.out.println("Enter radius of circle:");
		double r= sc.nextDouble();
		c.shapeOfObject();
		c.areaOfCircle(r);
		c.circum(r);
	}
}