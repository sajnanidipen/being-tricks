import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
class FrameDemo extends WindowAdapter{
	Frame f;
	FrameDemo(){
	
		f=new Frame("My Frame");
		TextField t=new TextField("Hello");
		t.setColumns(3);
		f.add(t);
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		f.add(new Button("+"));
		f.add(new Button("7"));
		f.add(new Button("8"));
		f.add(new Button("9"));
		f.add(new Button("-"));
		f.add(new Button("0"));
		f.add(new Button("CE"));
		f.add(new Button("*"));
		f.add(new Button("/"));
		f.addWindowListener(this);
		f.setSize(200,180);
		f.setLayout(new GridLayout(4,4));
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
	public static void main(String []args){
		new FrameDemo();
	}
}