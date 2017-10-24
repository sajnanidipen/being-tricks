import java.io.*;
import java.util.*;
public class add{
public  double add_two(int i,float j){
double d=i+j;
return d;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
add a1=new add();
int a=2;
float f=3.2f;
System.out.println("Addition ="+a1.add_two(a,f));
}
}