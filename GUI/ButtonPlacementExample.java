package Swing;

import javax.swing.*;
import java.awt.*;

public class ButtonPlacementExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Placement Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3,400,300)); // 2 rows, 3 columns grid layout

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        button1.setPreferredSize(new Dimension(80, 25)); // Set preferred size to 80x25 pixels
        // Adding buttons to specific cells in the grid layout
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
       

    }
}
