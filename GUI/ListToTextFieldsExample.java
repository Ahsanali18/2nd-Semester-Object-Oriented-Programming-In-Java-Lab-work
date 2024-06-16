package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;

public class ListToTextFieldsExample extends JFrame {
    private JList<String> dataList;
    private JTextField textField1;
    private JTextField textField2;
    private DefaultListModel<String> listModel;

    public ListToTextFieldsExample() {
        setTitle("List to TextFields Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        listModel = new DefaultListModel<>();
        // Populate the list with some sample data
        listModel.addElement("Data 1");
        listModel.addElement("Data 2");
        listModel.addElement("Data 3");

        dataList = new JList<>(listModel);
        dataList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        dataList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    // Get the selected data from the list
                    String selectedData = dataList.getSelectedValue();
                    // Populate text fields with the selected data
                    textField1.setText(selectedData);
                    textField2.setText(selectedData.toUpperCase()); // Example manipulation
                }
            }
        });

        textField1 = new JTextField();
        textField2 = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(dataList);
        panel.add(textField1);
        panel.add(textField2);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListToTextFieldsExample().setVisible(true);
            }
        });
    }
}
