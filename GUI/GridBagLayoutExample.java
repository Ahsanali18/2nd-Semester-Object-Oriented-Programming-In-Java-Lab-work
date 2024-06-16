package JavaGUI;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Color;

public class GridBagLayoutExample extends JFrame {
	public GridBagLayoutExample(){
		this.setLayout(new GridBagLayout());
		this.setSize(400, 400);
		this.setBackground(Color.CYAN);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton submit=new JButton("SUBMIT");
		submit.setBackground(Color.blue);
		JButton login=new JButton("LOGIN");
		login.setBackground(Color.gray);
		JButton exit=new JButton("EXIT");
		exit.setBackground(Color.green);
		JButton save=new JButton("SAVE");
		save.setBackground(Color.lightGray);
		JButton delete=new JButton("DELETE");
		delete.setBackground(Color.orange);
		
		this.add(submit); this.add(login); this.add(exit); this.add(save); this.add(delete); 
		
	}
	public static void main(String[] args) {
		GridBagLayoutExample obj=new GridBagLayoutExample();
	}
}
