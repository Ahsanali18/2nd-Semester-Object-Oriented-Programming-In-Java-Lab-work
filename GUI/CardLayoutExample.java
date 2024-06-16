package JavaGUI;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame implements ActionListener {
    private CardLayout cardLayout;

    public CardLayoutExample() {
        cardLayout = new CardLayout(30,30);
        this.setLayout(cardLayout);

        JButton button1 = new JButton("Button 1");
        button1.setBackground(Color.YELLOW);
        JButton button2 = new JButton("Button 2");
        button2.setBackground(Color.GRAY);
        JButton button3 = new JButton("Button 3");
        button3.setBackground(Color.GREEN);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        this.add(button1, "panel1");
        this.add(button2, "panel2");
        this.add(button3, "panel3");

        cardLayout.show(this.getContentPane(), "panel1");

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(this.getContentPane());
    }

    public static void main(String[] args) {
        CardLayoutExample obj=new CardLayoutExample();
    }
}
