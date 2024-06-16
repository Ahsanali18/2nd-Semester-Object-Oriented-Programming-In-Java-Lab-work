package JavaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpringLayoutExample extends JFrame implements ActionListener {
    private SpringLayout layout;

    public SpringLayoutExample() {
        layout = new SpringLayout();
        this.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(button3);

        // Define spring constraints for button1
        layout.putConstraint(SpringLayout.WEST, button1, 20, SpringLayout.WEST, this.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, button1, 20, SpringLayout.NORTH, this.getContentPane());

        // Define spring constraints for button2
        layout.putConstraint(SpringLayout.WEST, button2, 20, SpringLayout.EAST, button1);
        layout.putConstraint(SpringLayout.NORTH, button2, 20, SpringLayout.NORTH, this.getContentPane());

        // Define spring constraints for button3
        layout.putConstraint(SpringLayout.WEST, button3, 20, SpringLayout.EAST, button2);
        layout.putConstraint(SpringLayout.NORTH, button3, 20, SpringLayout.NORTH, this.getContentPane());

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button clicks here
        System.out.println("Button clicked: " + e.getActionCommand());
    }

    public static void main(String[] args) {
        new SpringLayoutExample();
    }
}
