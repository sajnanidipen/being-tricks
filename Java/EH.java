public class EH{
public static void main(String []args){
try{
int a=10/0;
System.out.println("value of a :"+a);
}
catch (arithmeticExcption e){
System.out.print("Error while dividing number by zero");
}
}
}