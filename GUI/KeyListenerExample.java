package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyListenerExample extends Frame implements KeyListener{
	public KeyListenerExample() {
		this.setSize(400, 400);
		this.setTitle("Key Listener Example");
		this.setVisible(true);
		this.setBackground(Color.cyan);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("Window Closed!");
			}
		});
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println("Key Typed "+ke.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		System.out.println("Key Pressed "+ke.getKeyChar());
	}
	@Override
	public void keyReleased(KeyEvent ke) {
		System.out.println("Key Released "+ke.getKeyChar());	
	}
	
	public static void main(String[] args) {
		KeyListenerExample obj=new KeyListenerExample();
	}
}
