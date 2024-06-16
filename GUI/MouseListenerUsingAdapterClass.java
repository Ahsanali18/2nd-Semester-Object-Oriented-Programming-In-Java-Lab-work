package AWT;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import java.awt.Color;
//import java.a;


public class MouseListenerUsingAdapterClass extends Frame{
	
	public MouseListenerUsingAdapterClass() {
		this.setSize(400,400);
		this.setVisible(true);
		this.setBackground(Color.PINK);
		this.setTitle("Window Adapter Example");
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("Window Closed!");
				System.exit(0);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				System.out.println("Mouse Clicked @t ("+me.getX()+","+me.getY()+")");
				
			}
		});
	}
	
	public static void main(String[] args) {
		MouseListenerUsingAdapterClass obj=new MouseListenerUsingAdapterClass();
	}
	
}
