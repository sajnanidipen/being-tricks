import java.util.*;
import java.io.*;

class India{
	public void country1(){
		System.out.println("India is my Country!");
	}
	
}

class State extends India{
	public void state1(){
		System.out.println("Maharashtra is my State!");
	}
}

class Mumbai extends State{
	public void state1(){
		super.state1();
		System.out.println("Mumbai is my city!");
	}
		
	public static void main (String args []){
		Mumbai mum = new Mumbai();
		mum.country1();
		mum.state1();
	}
}	