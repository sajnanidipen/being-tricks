import java.util.*;
import java.io.*;
public class Banker1{
	public static void main(String []args){
		int arr1[]={16,50,5,2};
		int arr2[][]={{3,2,2,1},{8,12,0,0},{2,1,0,0},{4,3,0,0},{2,0,3,1}};
		int arr3[][]={{1,1,1,0},{2,1,0,0},{1,0,0,0},{2,1,0,0},{1,0,0,0}};
		int need[][]=new int[5][4];
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<4;j++)
			{
				need[i][j]=arr2[i][j]-arr3[i][j];
			}
		}
		System.out.println("[");
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(need[i][j]+",");
			}
			System.out.println("");
		}
		System.out.println("]");
		boolean finish[]=new boolean[5];
		for(int i=0;i<5;i++)
		{
			finish[i]=false;
		}
		int work[]={16,50,5,2};
		for(int i=0;i<5;i++)
		{
			if(finish[i]=false)
			{
				for(int a=0;i<5;i++)
				{
					for(int j=0;j<4;j++)
					{
						if (need[a][j]<work[j])
						{
							System.out.println("safe");
						}
						else
						{
							System.out.println("not safe");
						}
					}
				}
			}
			else
			{
				System.out.println("not safe");
			}
		}
	}
	
}
