import java.util.*;
import java.io.*;

public class arrayy1{
	public static void main(String args[]){
		int i;
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements of Array");
		for(i=0;i<4;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Elements of Array are...");
		
		for(i=0;i<4;i++){
			System.out.println(arr[i]);
		}
		
	}
}