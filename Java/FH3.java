import java.io.*;
import java.util.*;

public class FH3{
	public static void main(String args[]){
		try
		{
			FileInputStream fin=new FileInputStream("input.txt");
			FileOutputStream fout =new FileOutputStream("output.txt");
		int c;
		while((c=fin.read())!=-1)
		{
			fout.write(c);
		}
		}
		catch(Exception e)
		{
			System.out.print("File not Found..");
		}
	}
}