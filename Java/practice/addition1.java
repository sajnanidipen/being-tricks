import java.util.*;
import java.io.*;

public class addition1{
	public int add_no(int a, int b){
		int c = a+b;
		return c;
	}
	
	public static void main(String args[]){
		addition1 a1 = new addition1();
		System.out.println(a1.add_no(3,4));
	}		
	
}