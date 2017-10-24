import java.util.*;
import java.io.*;
class pm{
	
	static ArrayList<myprocess> pqueue;
	pm(){
		pqueue=new ArrayList<myprocess>();
	}
	public void addproc(myprocess a){
		pqueue.add(a);
	}
	public static void main(String args[]){
	pm a=new pm();
	myprocess mp1=new myprocess(3,"windword");
	myprocess mp2=new myprocess(4,"python");
	a.addproc(mp1);
	a.addproc(mp2);
		Iterator itr=pqueue.iterator();
		while(itr.hasNext()){
			myprocess st=(myprocess)itr.next();
			System.out.println(st.no_inst+" "+ st.nm);
			itr.remove();
		} 
	}	
} 
class myprocess{
	int no_inst;
	String nm;
	myprocess(int x,String y){
		no_inst=x;
		nm=y;
	}
}