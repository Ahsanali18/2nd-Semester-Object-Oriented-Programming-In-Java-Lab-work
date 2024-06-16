package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MouseExample extends JFrame implements MouseListener{
	private ArrayList<String> data;
	private JList<String> list;
	private JTextField f1;
	private Container container;
	
	public MouseExample() {
		container=getContentPane();
		data=new ArrayList<String>();
		data.add("Aslam");
		data.add("Asif");
		data.add("Altaf");
		data.add("Ahmed");
		data.add("Furqan");
		data.add("Ali");
		
		this.setTitle("List Example");
		this.setSize(400, 400);
		
		
		list=new JList<String>(data.toArray(new String[0]));
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		container.setLayout(new FlowLayout());
		
		f1=new JTextField(20);
		
		JScrollPane bar=new JScrollPane(list);
		
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent lse) {
				if(!lse.getValueIsAdjusting()) {
					String selected=list.getSelectedValue();
					f1.setText(selected);
				}
			}
		});
		
		container.add(bar);
		container.add(f1);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MouseExample obj=new MouseExample();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
