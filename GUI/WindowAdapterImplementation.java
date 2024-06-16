package AWT;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterImplementation extends WindowAdapter{	
	@Override
	public void windowClosing(WindowEvent we) {
		System.out.println("Window closing");
		System.exit(0);
	}
}
