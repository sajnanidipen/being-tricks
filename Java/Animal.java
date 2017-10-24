import java.io.*;
import java.util.*;

class Animal
{
	public void animal1()
	{
		System.out.println("Thereare many types of animals such as :");

	}
}
class Cat extends Animal
{
	public void cat1()
	{
		System.out.println("Cat");
	}
}
class kitten extends Cat{
    public void cat1(){
        super.cat1();
        System.out.println("young one of Cat");
    }
    public static void main(String args[])
	    {
		    kitten s= new kitten();
            s.animal1();
            s.cat1();
	    }
}
	
