import java.util.*;
import java.io.*;

class StrungBoofer{
	public static void main(String args[]){
		StringBuffer r1 = new StringBuffer("This is String 1");
		StringBuffer r2 = new StringBuffer("This is String 2");
		System.out.println(r1.length());
		System.out.println(r1.insert(4,"Inserttt"));
		System.out.println(r1.delete(0,4));
		System.out.println(r1.append(" jio"));
		System.out.println(r1.reverse());
		System.out.println(r1.capacity());
	}
}
		
		