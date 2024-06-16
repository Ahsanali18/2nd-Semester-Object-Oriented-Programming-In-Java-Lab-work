package AWT;
import java.awt.Frame;
import java.awt.Color;

public class RunWindowListener extends Frame{
	public RunWindowListener() {
		this.setSize(400,400);
		this.setVisible(true);
		this.setBackground(Color.YELLOW);
		this.addWindowListener(new WindowListenerImplementation());
	}
	
	public static void main(String[] args) {
		RunWindowListener obj=new RunWindowListener();
	}
}
