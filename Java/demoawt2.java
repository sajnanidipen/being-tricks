import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class demoawt2 extends WindowAdapter {
  

//public   class demoawt2 extends WindowAdapter implements ActionListener{
	Frame f;
	demoawt2(){
		Frame f=new Frame("my frame ");
		f.setSize(400,400);
		f.addWindowListener(this);
		f.setLayout(null);
		f.setVisible(true);
		Label l=new Label();
		l.setBounds(50,100,100,200);
		Button b=new Button("click me ");
		b.setBounds(300,300,400,400);
		f.add(l);
		f.add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			l.setText("welcome");
			
			}
			
		});
		
	}
	public void WindowListener(WindowEvent we){
	f.dispose();	
	}
	public void windowClosing(WindowEvent we){
		System.exit(0);
		}
	
	public static void main(String args[]){
	demoawt2 a=new demoawt2();		}

}