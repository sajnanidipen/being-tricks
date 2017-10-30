import java.util.*;
import java.io.*;


public class string1{
	public void istring(){
		String s1=new String();
		s1=("Hello User");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(" Welcome"));
		System.out.println(s1.equals(4));
	}
	public void stringbuff(){
		StringBuffer s2=new StringBuffer("My name is Dipen");
		System.out.println(s2.length());
		System.out.println(s2.insert(16," ,Blogger!"));
		System.out.println(s2.delete(0,3));
		System.out.println(s2.append(",Internet Marketer!"));
		System.out.println(s2.reverse());
	}
	public void stringtok(){
		StringTokenizer s3=new StringTokenizer("All that glitters /is not /gold!!");
		System.out.print(s3.nextToken("gold"));
		System.out.print(s3.countTokens());
		while(s3.hasMoreTokens()){
			System.out.print(s3.nextToken("is"));
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		string1 s=new string1();
		
		System.out.println("Enter 1=String Enter 2=String Buffer Enter 3=String Tokenizer");
		int op=sc.nextInt();
		switch(op){
			case 1:
				s.istring();
				break;
			case 2:
				s.stringbuff();
				break;
			case 3:
				s.stringtok();
				break;
			default:
				System.out.println("Invalid Choice!!");
	}
	}
}