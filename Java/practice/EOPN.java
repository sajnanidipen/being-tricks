import java.util.*;
import java.io.*;

public class EOPN{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.println("Enter the Number:");
			num=sc.nextInt();
			
			if(num%2==0){
				if(num>0){
					System.out.println("Number is even and positive");
				}
				else{
					System.out.println("Number is even and negative");
				}
				
			}
			else if(num%2!=0){
				if(num>0){
					System.out.println("Number is odd and positive");
				}
				else{
					System.out.println("Number is odd and negative");
				}
			}
			
			else{
				System.out.println("Number is zero");
			}

			
			
	}
}