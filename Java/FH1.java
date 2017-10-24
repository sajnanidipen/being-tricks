import java.io.*;
import java.util.*;

public class FH1{
public static void main(String args[]){
try{
File f=new File("D:/sycs/java");
String path[]=f.list();
for(String p:path){
System.out.println(p);
}
}
catch (Exception e){
System.out.print("file not found");
}
}
}