package Swing;
//getContentPane().setBackground(Color.BLUE);

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class RegistrationForm extends JFrame implements ActionListener {
	JPanel r1,r2,r3,r4,r5;
	JButton submit;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3;
	JTextArea a;
	JPasswordField p;
	
	public RegistrationForm(){
		
		this.setSize(500, 500);
		this.setTitle("Registration Form");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setBackground(Color.BLUE);
		
		//Row-1
		l1=new JLabel("Enter User Name: ");
		t1=new JTextField(20);
		r1=new JPanel();
		
		r1.add(l1);
		r1.add(t1);
		this.add(r1);
		
		//Row-2
		l2=new JLabel("Enter Password: ");
		p=new JPasswordField(20);
		p.setEchoChar('*');
		r2=new JPanel();
		
		r2.add(l2);
		r2.add(p);
		this.add(r2);
		
		//Row-3
		l3=new JLabel("Enter Email: ");
		t2=new JTextField(20);
		r3=new JPanel();
		r3.add(l3);
		r3.add(t2);
		
		this.add(r3);
		
		//Row-4
		l4=new JLabel("Enter Mobile Number: ");
		t3=new JTextField(20);
		r4=new JPanel();
		r4.add(l4);
		r4.add(t3);
		
		this.add(r4);
		
		//Row-5
		l5=new JLabel("Enter Adress: ");
		a=new JTextArea(5,20);
		
		r5=new JPanel();
		r5.add(l5);
		r5.add(a);
		
		this.add(r5);
		
		submit=new JButton("Submit");
		submit.addActionListener(this);
		this.add(submit);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Your User Name is: "+t1.getText());
		System.out.print("Your Password is: ");
		char[] password= p.getPassword();
		for(char p:password) {
			System.out.print(p);
		}
		System.out.println();
		System.out.println("Your Email Adress is: "+t2.getText());
		System.out.println("Your Mobile Number is: "+t3.getText());
		System.out.println("Your Adress is: "+a.getText());
		System.out.println("(Thank-You For Registration)");
	}
	public static void main(String[] args) {
		RegistrationForm obj=new RegistrationForm();
	}
}
