package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JListMouseListenerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JList Mouse Listener Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a sample array of items
            String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            // Create a JList with the sample items
            JList<String> list = new JList<>(items);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            // Add a mouse listener to the JList
            list.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) { // Double-click detected
                        int index = list.locationToIndex(e.getPoint());
                        if (index != -1) {
                            String selectedItem = list.getModel().getElementAt(index);
                            System.out.println("Double-clicked on: " + selectedItem);
                        }
                    }
                }
            });

            // Add the JList to a JScrollPane and add the scroll pane to the frame
            JScrollPane scrollPane = new JScrollPane(list);
            frame.add(scrollPane, BorderLayout.CENTER);

            // Set frame size and make it visible
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }
}
