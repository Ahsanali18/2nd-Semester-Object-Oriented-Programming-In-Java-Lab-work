package Swing;
import javax.swing.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Container;
import java.io.IOException;
import java.io.*;
public class DarazOrderingSystem extends JFrame {
	private ArrayList<String> items;
	private JList<String> list;
	private JTextField t1,t2,t3,t4,t5;
	private JLabel l1,l2,l3,l4,l5;
	private JPasswordField p;
	private JTextArea a;
	private JButton b1,b2,b3;
	private Container container;	
	
	public DarazOrderingSystem() {
		container=getContentPane();
		this.setSize(500, 650);
		this.setTitle("Daraz Ordering System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		l1=new JLabel("Welcome Daraz Ordering System");
		l1.setBounds(150, 80, 250, 25);
		
		l2=new JLabel("Enter Name: ");
		l2.setBounds(80, 150, 180, 25);
		t1=new JTextField();
		t1.setBounds(220, 150, 120, 25);
		
		l3=new JLabel("Enter Last Name: ");
		l3.setBounds(80, 180, 180, 25);
		t2=new JTextField();
		t2.setBounds(220, 180, 120, 25);
		
		l4=new JLabel("Enter Password");
		l4.setBounds(80, 210, 180, 25);
		p=new JPasswordField();
		p.setBounds(220, 210, 120, 25);
		
		b1=new JButton("Order");
		b1.setBounds(80, 280, 100, 25);
		
		b2=new JButton("Cancel");
		b2.setBounds(220, 280, 100, 25);
		
		a=new JTextArea();
		a.setBounds(120, 340, 180, 180);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				String path="C://Users//Lenovo//Desktop//DarazSystem.txt";
				char[] password=p.getPassword();
				String converter=new String(password);
				String selectedItem=list.getSelectedValue();
				String data = "First Name: " + t1.getText() + "\n"
		                + "Last Name: " + t2.getText() + "\n"
		                + "Password: " + converter + "\n"
		                + "Selected Item: " + selectedItem + "\n\n";
				
				File f=new File(path);
				FileWriter fw=null;
				
				a.append(data);
				
				try {
					fw=new FileWriter(path,true);
					fw.write(data);
					System.out.println("Data Saved in file: "+f.getName()+" having location: "+f.getAbsolutePath());
				}catch(IOException ie) {
					ie.printStackTrace();
				}
				finally {
					try {
					fw.close();
				}catch(IOException ie) {
					ie.printStackTrace();
					}
				}
			}
		});
		items=new ArrayList<>();
		items.add("Comb");
		items.add("T-Shirt");
		items.add("Tousers");
		items.add("Belt");
		items.add("Cream");
		items.add("Regitser Book");
		items.add("Smart Phone");
		items.add("Head Phones");
		items.add("Chair");
		l5=new JLabel("Selected Item is: ");
		l5.setBounds(100, 530, 180, 25);
		
		t5=new JTextField();
		t5.setBounds(200, 530, 100, 25);
		
		list=new JList<>(items.toArray(new String[0]));
		list.setVisibleRowCount(4);
		JScrollPane scroll=new JScrollPane(list);
		scroll.setBounds(360, 120, 120, 120);
		
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent lse) {
				String getItems=list.getSelectedValue();
				t5.setText(getItems);
			}
		});
			
		container.add(l1);
		container.add(l2);
		container.add(t1);
		container.add(l3);
		container.add(t2);
		container.add(l4);
		container.add(p);
		container.add(b1);
		container.add(b2);
		container.add(l5);
		container.add(t5);
		container.add(a);
		container.add(scroll);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		DarazOrderingSystem os=new DarazOrderingSystem();
		
	}
	
}
