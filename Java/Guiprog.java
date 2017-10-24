import java.awt.*;
import java.awt.event.*;

 class Guiprog extends WindowAdapter{
	public static void main(String args[]){
	Frame f= new Frame("drogon");
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);

	TextArea b1=new TextArea("     ");
	f.add(b1);
	Button oneButton = new Button("1");
	Button twoButton = new Button("2");
	Button threeButton = new Button("3");
	Button fourButton = new Button("4");
	Button fiveButton = new Button("5");
	Button sixButton = new Button("6");
	Button sevenButton = new Button("7");
	Button eightButton = new Button("8");
	Button nineButton = new Button("9");
	Button zeroButton = new Button("0");
	Button divButton = new Button("/");
	Button mulButton = new Button("x");
	Button plusButton = new Button("+");
	Button minusButton = new Button("-");
	Button equalButton =new Button("=");
	Button clearButton= new Button("C");
	oneButton.setBounds(25,80,50,50);
	f.add(oneButton);
	twoButton.setBounds(80,80,50,50);
	f.add(twoButton);
	threeButton.setBounds(135,80,50,50);
	f.add(threeButton);
	fourButton.setBounds(25,135,50,50);
	f.add(fourButton);
	fiveButton.setBounds(80,135,50,50);
	f.add(fiveButton);
	sixButton.setBounds(135,135,50,50);
	f.add(sixButton);
	sevenButton.setBounds(25,190,50,50);
	f.add(sevenButton);
	eightButton.setBounds(80,190,50,50);
	f.add(eightButton);
	nineButton.setBounds(135,190,50,50);
	f.add(nineButton);
	zeroButton.setBounds(80,245,50,50);
	f.add(zeroButton);
	divButton.setBounds(200,245,50,50);
	f.add(divButton);
	mulButton.setBounds(200,190,50,50);
	f.add(mulButton);
	plusButton.setBounds(200,80,50,50);
	f.add(plusButton);
	minusButton.setBounds(200,135,50,50);
	f.add(minusButton);
	equalButton.setBounds(135,245,50,50);
	f.add(equalButton);
    clearButton.setBounds(25,245,50,50);
	f.add(clearButton);

	}

}