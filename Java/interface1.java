import java.util.*;
import java.io.*;
class a{
	public void X(){
		System.out.println("Function name is X");
	}
}
class b extends a{
	public void Y(){
		System.out.println("Function name is Y");
	}
}
interface c{
	void xyz();
}
interface d extends c{
	 void abc();
		
}
class demo extends b implements d{
	public void xyz(){
		 System.out.println("Function name is xyz");
	} 
	public void abc(){
		 System.out.println("Function name is abc");
	} 
	public static void main(String args[]){
		demo d1=new demo();
		d1.xyz();
		d1.Y();
		d1.X();	
	}	
}