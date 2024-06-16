package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.*;

public class WindowAnnonimousImplementation extends Frame{
	WindowAnnonimousImplementation(){
		this.setSize(400, 400);
		this.setVisible(true);
		this.setTitle("Window Annonimous");
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("Window Closing");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		WindowAnnonimousImplementation obj=new WindowAnnonimousImplementation();
	}
}
