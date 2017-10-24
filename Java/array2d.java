import java.util.*;
import java.io.*;
public class array2d{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int arr1[][]=new int[2][2];
	int arr2[][]=new int[2][2];
	int arr3[][]=new int[2][2];
	int arr4[][]=new int[2][2];
	int arr5[][]=new int[2][2];
	int i,j,sum=0,sub,k,c;
	do{
	System.out.println("Enter the elements of the 2*2 array.");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr1[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
	

System.out.println("Enter the elements of the 2*2 array.");
		for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr2[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}

	

System.out.println("enter 1.addition,2.substraction,3.transpose,4.multplication:");
k=sc.nextInt();	
switch(k){
case 1:	
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}	
	System.out.println("addition of array are");
	System.out.println(" ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr3[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
	break;
case 2:
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			arr4[i][j]=arr1[i][j]-arr2[i][j];
			}
		}	
	System.out.println("subraction of array are");
	System.out.println(" ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr4[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
	break;

case 3:		
	System.out.println("transpose of 1st array matrix");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr1[j][i]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
	break;
case 4:
	System.out.println("multiplying  1st and 2nd array matrix");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			arr5[i][j]=arr2[i][j]*arr1[i][j];
			}
		}	
		for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			System.out.print(arr5[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}

		break;
default:
System.out.println("invalid number.");
	}
	System.out.println("do you want to continue 1 = yes and 2 = no.");
	c=sc.nextInt();
	}while(c!=2);
	}
}