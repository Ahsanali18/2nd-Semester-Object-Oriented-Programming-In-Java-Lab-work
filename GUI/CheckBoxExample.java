package Swing;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.*;

public class CheckBoxExample extends JFrame{
	JCheckBox cb1,cb2;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3;
	
	public CheckBoxExample() {
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Check-Box Example");
		
		cb1=new JCheckBox("C++");
		cb2=new JCheckBox("Java");
		
		l1=new JLabel("Check-Box:1");
		l2=new JLabel("Check-Box:2");
		
		b1=new JButton("Submit"); b2=new JButton("CLose"); b3=new JButton("Open");
		
		JPanel row1=new JPanel();
		row1.add(l1);
		row1.add(cb1);
		
		JPanel row2=new JPanel();
		row2.add(l2);
		row2.add(cb2);
		
		JPanel b=new JPanel();
		
		b.add(b1);  b.add(b2); b.add(b3);
		
		this.add(row1);
		this.add(row2);
		this.add(b);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		CheckBoxExample obj=new CheckBoxExample();
	}
}
