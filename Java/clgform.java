import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;  
public class clgform extends WindowAdapter
{
    Frame fm;
    Choice c,c1,c2;
    CheckboxGroup cbg;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    TextArea ta1;
    clgform()
    {
        fm=new Frame("Registration Form"); 
        fm.addWindowListener(this);
        fm.setLayout(new GridLayout(12,2));
        /*l1=new Label("Student details",Label.CENTER);
        fm.add(l1);*/
        l2=new Label("Name:",Label.LEFT);
        fm.add(l2);
        t1=new TextField();
        fm.add(t1);

        l3=new Label("Father's Name:",Label.LEFT);
        fm.add(l3);
        t2=new TextField();
        fm.add(t2);

        l4=new Label("Mother's Name:",Label.LEFT);
        fm.add(l4);
        t3=new TextField();
        fm.add(t3);

        /*l12=new Label("Gender:",Label.LEFT);
        fm.add(l12);
        cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("Male", cbg, false);   
        Checkbox checkBox2 = new Checkbox("Female", cbg, false);        
        fm.add(checkBox1);    
        fm.add(checkBox2);*/
        l12=new Label("Gender:",Label.LEFT);
        fm.add(l12);
        c2=new Choice();
        c2.add("Select gender");
        c2.add("Male");  
        c2.add("Female");
        c2.add("Others");  
        fm.add(c2);

        l5=new Label("Class:",Label.LEFT);
        fm.add(l5);
        c=new Choice();
        c.add("Select class");
        c.add("FY BSc CS");  
        c.add("SY BSc CS");  
        c.add("TY BSc CS");  
        fm.add(c);

        l6=new Label("Roll No:",Label.LEFT);
        fm.add(l6);
        t4=new TextField();
        fm.add(t4);

        l7=new Label("Stud ID:",Label.LEFT);
        fm.add(l7);
        t5=new TextField();
        fm.add(t5);

        l8=new Label("Date Of Birth:",Label.LEFT);
        fm.add(l8);
        t6=new TextField();
        fm.add(t6);

        l2=new Label("Blood Group:",Label.LEFT);
        fm.add(l2);
        c1=new Choice();
        c1.add("Select blood group");
        c1.add("A+");  
        c1.add("B+");  
        c1.add("O+"); 
        c1.add("AB+");  
        c1.add("A-");  
        c1.add("B-");
        c1.add("O-");  
        c1.add("AB-");
        fm.add(c1);

        l9=new Label("Address:",Label.LEFT);
        fm.add(l9);
        ta1=new TextArea();
        fm.add(ta1);

        l10=new Label("Contact No.:",Label.LEFT);
        fm.add(l10);
        t7=new TextField();
        fm.add(t7);

        l11=new Label("Email Id:",Label.LEFT);
        fm.add(l11);
        t8=new TextField();
        fm.add(t8);
        //Button b1 = new Button("Submit");
        //fm.add(b1);

        fm.setSize(500,700);  
        fm.setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        fm.dispose();
    }
    public static void main(String[]args)  
    {
        new clgform();
    }
}

