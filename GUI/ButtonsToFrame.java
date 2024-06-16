package AWT;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonsToFrame extends Frame{
	public ButtonsToFrame(){
		this.setSize(400, 400);
		this.setVisible(true);
		this.setBackground(Color.YELLOW);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		Button b1=new Button("Welcome");
		b1.setBounds(50, 100, 100, 60);
		this.add(b1);
		
		Button b2=new Button("Hello");
		b2.setBounds(50, 100, 100, 60);
		this.add(b2);
		
		this.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		ButtonsToFrame obj=new ButtonsToFrame();
	}
}
