import java.util.*;
import java.io.*;

class Sync1{
	synchronized void printMe(int n){
		for(int i=0;i<5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}		
}

class T1 extends Thread{
	Sync1 t;
	T1(Sync1 t){
		this.t=t;
	}
	public void run(){
		t.printMe(10);
	}
}
class T2 extends Thread{
	Sync1 t;
	T2(Sync1 t){
		this.t=t;
	}
	public void run(){
		t.printMe(55);
	}
}

class NewSync{
	public static void main(String args[]){
		Sync1 obj=new Sync1();
		T1 t1=new T1(obj);
		T2 t2=new T2(obj);
		t1.start();
		t2.start();
	}
}