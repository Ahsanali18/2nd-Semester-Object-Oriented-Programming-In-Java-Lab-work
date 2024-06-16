//Use Jframe as inheritance(extends)

//Use card, grid, gridbag, and spring layout.
package JavaGUI;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Example1 extends JFrame {
	public Example1(){
		this.setLayout(new FlowLayout());
		
		JButton submit=new JButton("SUBMIT");
		submit.setBackground(Color.YELLOW);
		this.add(submit);
		this.setSize(400, 400);
		this.setBackground(Color.YELLOW);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Example1 obj=new Example1();
	}
}
