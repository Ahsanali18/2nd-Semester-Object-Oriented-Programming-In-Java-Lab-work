package Swing;
import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
    public MyForm() {
        this.setTitle("Registration Form");
        this.setLayout(new FlowLayout());

        // Add components and set up the frame

        this.setVisible(true); // Show the frame before maximizing
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame

        Dimension size = this.getSize(); // Get the size after maximizing
        System.out.println("Frame size after maximizing: " + size.width + "x" + size.height);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyForm obj = new MyForm();
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.setSize(400, 400);
        });
    }
}
