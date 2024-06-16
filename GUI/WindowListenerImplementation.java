package AWT;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;
import java.awt.Color;


public class WindowListenerImplementation extends Frame  implements WindowListener{
	
	public WindowListenerImplementation() {

		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened!");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing!");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed!");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified!");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified!");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated!");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated!");
	}
	
}
