package AWT;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;


public class FlowLayoutExample extends Frame{
	FlowLayoutExample(){
		this.setLayout(new FlowLayout());
		this.setSize(300,300);
		this.setVisible(true);
		this.setBackground(Color.cyan);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		Button b1=new Button("Button1");
		Button b2=new Button("Button2");
		Button b3=new Button("Button3");
		Button b4=new Button("Button4");
		Button b5=new Button("Button5");
		
		this.add(b1); this.add(b2); this.add(b3); this.add(b4); this.add(b5);
	}
	public static void main(String[] args) {
		FlowLayoutExample obj=new FlowLayoutExample();
	}
}
