class Parent{
public void name(){
System.out.println("Parents name");
}
}
class Child extends Parent{
public void name(){
System.out.println("Child name");
}
public static void main(String args[]){
Child p=new Child();
p.name();
}
}

