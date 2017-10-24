import java.io.*;
import java.util.*;

class Sycs
{
	public void sycs1()
	{
		System.out.println("This is SYCS class.");

	}
}
class Subject extends Sycs
{
	public void sub()
	{
		System.out.println("there are7 subjects in SYCS.");
	}
}
class Stud1 extends Subject{
    public void student1(){
        System.out.println("1. Ashish");
    }
}
class Stud2 extends Subject{
    public void student2(){
        System.out.println("2. Akhil");
    }
    
}
class demo1{
    public static void main(String args[])
	    {
            Stud1 s1 = new Stud1();
		    Stud2 s2 = new Stud2();
            s1.sycs1();
            s1.sub();
            s1.student1();
            s2.student2();
          
	    }
}
