package AWT;
import java.awt.Frame;
import java.awt.Color;

public class RunWindowAdapter extends Frame{
	RunWindowAdapter(){
		this.setSize(400,400);
		this.setVisible(true);
		this.setBackground(Color.CYAN);
		this.setTitle("Window Adapter");
		addWindowListener(new WindowAdapterImplementation());
	}
	
	public static void main(String[] args) {
		RunWindowAdapter obj=new RunWindowAdapter();
	}
}
