package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyListenerUsingAdapter extends Frame{
	KeyListenerUsingAdapter(){
		this.setSize(400, 400);
		this.setVisible(true);
		this.setTitle("Key Listener Using Adapter");
		this.setBackground(Color.YELLOW);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("Window Closed");
				System.exit(0);
			}
		});
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ke) {
				System.out.println("Key Typed "+ke.getKeyChar()+" through keyboard");
			}
		});
	}
	public static void main(String[] args) {
		KeyListenerUsingAdapter obj=new KeyListenerUsingAdapter();
		
	}
}
