import java.io.*;
import java.util.*;

public class Banker{
public static void main(String args[]){
int avail[]={16,50,5,2};
boolean finish[]={false,false,false,false,false};
int work[]={16,50,5,2};
int claim[][]={{3,2,2,1},{8,100,0,0},{2,1,0,0},{4,3,0,0},{2,0,3,1}};
int alloct[][]={{2,1,1,0},{2,40,0,0},{1,0,0,0},{2,1,0,0},{1,0,0,0}};
int need[][]=new int[5][4];
for(int i=0;i<5;i++){
for(int j=0;j<4;j++){
need[i][j]=claim[i][j]-alloct[i][j];
}
}
for(int i=0;i<5;i++){
for(int j=0;j<4;j++){
System.out.print(need[i][j]+" ");
}
System.out.println(" ");
}


for(int i=0;i<5;i++){
	int a=0;
	if(finish[i]==false){
				
			boolean test=false;
		        for(int k=0;k<4;k++){
					if(need[i][k]>work[k]){
						System.out.println("process:"+i+"cannot be completed");
						break;
						}
				}
			
				for(int k=0;k<4;k++){
					if(need[i][k]!=0&&need[i][k]<=work[k]){
						work[k]=work[k]-need[i][k];
						a=1;
						}
					else{
						a=0;
						break;
						}
					}
				
		if(a==1){
			System.out.println("process can be completed");
			System.out.println("resources left are : ");
			for(int z=0;z<4;z++){
				System.out.print(work[z]+" ");
			}
		}
		else if(a==0){
			System.out.println("process cannot be completed");
			}
		else{
			System.out.println("invalid");
		}
	
}
	else{
		System.out.println("Process already completed.");
	}
}
}
}



