package FinalGUILabTasks;
import java.awt.*;
import java.awt.event.*;

public class Lab14_Task2 extends Frame implements ActionListener, ItemListener, MouseListener, MouseMotionListener, WindowListener, KeyListener, TextListener {
    private Label label;
    private TextField textField;
    private Button button;
    private Checkbox checkbox;

    public Lab14_Task2() {
        setTitle("Listener Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        label = new Label("Enter Text:");
        textField = new TextField(20);
        button = new Button("Click Me");
        checkbox = new Checkbox("Check Me");

        textField.addTextListener(this);
        button.addActionListener(this);
        checkbox.addItemListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);
        addKeyListener(this);
        
        add(label);
        add(textField);
        add(button);
        add(checkbox);
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
        // Change background color of the frame
        this.setBackground(Color.CYAN);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox state changed: " + checkbox.getState());
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closed");
        System.exit(0);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Pressed: " + keyChar);
    }
    // Other overridden methods remain unchanged
    	public static void main(String[] args) {
        Lab14_Task2 obj=new Lab14_Task2();
    }
    // Other Overridden interface methods need to be implemented but can be left empty
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void textValueChanged(TextEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
