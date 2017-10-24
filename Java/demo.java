import java.io.*;
import java.util.*;
public class Pizza{
int price,no_of_slices;
String type,shapes;
public Pizza(String type1,int price1){
	type=type1;
	price=price1;
System.out.println("Type of pizza is "+type+"and price is "+price);
}
public static void main(String args[]){
Pizza p=new Pizza();
}
}