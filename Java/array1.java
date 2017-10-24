import java.io.*;
import java.util.*;
public class array1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sum=0,sub,i;
	int arr[]=new int[5];
	System.out.println("Enter the elements of the array");
	for(i=0;i<5;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<5;i++){
		System.out.println(arr[i]);
	}
	for(i=0;i<5;i++){
		sum=sum+arr[i];
	}
	System.out.println("Sum = "+sum);
	sub=arr[4]-arr[1];
	System.out.println("subtraction is "+sub);
	System.out.println("Printing horizontally");
	for(i=0;i<5;i++){
		System.out.print(arr[i]);
	}
	System.out.println(" ");
	System.out.println("Printing vertically");
	for(i=0;i<5;i++){
		System.out.println(arr[i]);
			}
		}
	}