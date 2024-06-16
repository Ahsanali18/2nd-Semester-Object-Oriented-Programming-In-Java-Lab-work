package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerExample extends Frame implements MouseListener {
	MouseListenerExample()
	{
		this.setSize(400,400);
		this.setVisible(true);
		this.setBackground(Color.YELLOW);
		this.setTitle("Mouse Listener Implementation");
		this.addMouseListener(this);   // Because this class implementing the MouseListener Interface that's why (this)
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closed");
			}
		});
		 
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked  @t ("+e.getX()+","+e.getY()+")");
		dispose();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed  @t ("+e.getX()+","+e.getY()+")");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Release  @t ("+e.getX()+","+e.getY()+")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered  @t ("+e.getX()+","+e.getY()+")");	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited  @t ("+e.getX()+","+e.getY()+")");	
	}
	
	public static void main(String[] args) {
		MouseListenerExample obj=new MouseListenerExample();
	}
	
		
}
