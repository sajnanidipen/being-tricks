import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Button1 extends WindowAdapter{
Frame f;
Button1(){
f=new Frame("calculator");
Button b1=new Button("1");
//b1.setBounds(0,20,20,40);
f.add(b1);
Button b2=new Button("2");
//b2.setBounds(20,20,40,40);
f.add(b2);
Button b3=new Button("3");
//b3.setBounds(40,20,60,40);
f.add(b3);
Button b4=new Button("+");
//b4.setBounds(60,20,80,40);
f.add(b4);
Button b5=new Button("5");
//b5.setBounds(0,40,20,60);
f.add(b5);
f.setLayout(new GridLayout(4,4));
f.addWindowListener(this);
f.setSize(80,100);
f.setVisible(true);
}
public void windowClosing(WindowEvent we){
	System.exit(0);
}
public static void main(String args[]){
	new Button1();
}
}