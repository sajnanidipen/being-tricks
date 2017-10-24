import java.io.*;
import java.util.*;
public class Language{

public Language(String a){
System.out.println("the default language is"+a);
}

public Language(String a,String b){
System.out.print(a+" "+b);
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the preferred language");
String b=sc.next();
Language l=new Language("Hindi");
Language l1=new Language("Hindi",b);
}
}