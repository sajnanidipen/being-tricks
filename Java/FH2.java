import java.io.*;
import java.util.*;

public class FH2 implements FilenameFilter{
String ext;
public FH2(String s){
ext="."+s;
}
public boolean accept(File f,String name){
return name.endsWith(ext);
}
public static void main(String args[]){
try{
File f=new File("D:/sycs/java");
FilenameFilter ff= new FH2("pdf");
String path[]=f.list(ff);
for(String p:path){
	System.out.println(p);
	}
}
catch (Exception e){
	System.out.print("file not found");
}
}
}