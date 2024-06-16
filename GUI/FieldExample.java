package Swing;
import javax.swing.*;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class FieldExample extends JFrame {
    public FieldExample() {
    	this.setLayout(new GridLayout());
        JButton b1, b2, b3;
        JLabel l1, l2, l3;
        JTextField f1, f2;
        JTextArea a1,a2,a3;
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        	//Row-1
        l1 = new JLabel("Name: ");
        f1 = new JTextField(20);
        f1.setText("Enter Name");
        f1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (f1.getText().equals("Enter Name")) {
                    f1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (f1.getText().isEmpty()) {
                    f1.setText("Enter Name");
                }
            }
        });
        b1 = new JButton("Next");
        a1 = new JTextArea(15, 20);
        
        JPanel row1 = new JPanel();
        row1.add(l1);
        row1.add(f1);
        row1.add(b1);
        row1.add(a1);
        
        this.add(row1);

        //Row-2
        l2 = new JLabel("Father Name: ");
        f2 = new JTextField(20);
        f2.setText("Enter Father Name");
        f2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (f2.getText().equals("Enter Father Name")) {
                    f2.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (f2.getText().isEmpty()) {
                    f2.setText("Enter Father Name");
                }
            }
        });
        
        b2 = new JButton("Next");
        a2=new JTextArea(15,20);
        
        JPanel row2=new JPanel();
        
        row2.add(l2);
        row2.add(f2);
        row2.add(b2);
        row2.add(a2);
        
        this.add(row2);
        
        //Row-3
        l3 = new JLabel("Password ");
        JPasswordField password = new JPasswordField(20);
        password.setText("Enter Password");
        password.setEchoChar('*');
        password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(password.getPassword()).equals("Enter Password")) {
                    password.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(password.getPassword()).isEmpty()) {
                    password.setText("Enter Password");
                }
            }
        });
        
        b3 = new JButton("SUBMIT");
        a3=new JTextArea(15,20);
        
        JPanel row3 = new JPanel();
        
        row3.add(l3);
        row3.add(password);
        row3.add(b3);
        row3.add(a3);
        this.add(row3);
        
        this.setVisible(true);
    }

    public static void main(String[] args) {
        FieldExample obj = new FieldExample();
    }
}
