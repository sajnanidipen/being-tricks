import java.util.*;
import java.io.*;

class Strung{
	public static void main(String args[]){
		StringTokenizer st1 = new StringTokenizer("This is String 1");
		StringTokenizer st2 = new StringTokenizer("This is String 2");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken("Str"));
		}
		System.out.println(st1.countTokens());
		System.out.println(st1.nextToken("Str"));
	}
	
}
