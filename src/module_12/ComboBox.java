package module_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox {
    public static void main(String[] args) {
        ComboBox comboBox = new ComboBox();
    }
    public ComboBox(){
        // Create a frame
        JFrame frame = new JFrame("ComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        frame.add(panel);
        panel.setBackground(new Color(0x1C2538));
        panel.setLayout(null);

        // Create a label
        JLabel label = new JLabel("OOP Laboratory Work is fun! LOL");
        label.setBounds(50, 50, 400, 30);
        label.setFont(new Font("Poppins", Font.BOLD, 20));
        label.setForeground(new Color(0xFFFFFF));
        panel.add(label);

        // Create a combo box
        String[] respond = {"Sangat Tidak Setuju", "Tidak Setuju", "Kurang Setuju", "Setuju", "Sangat Setuju"};
        JComboBox comboBox = new JComboBox(respond);
        comboBox.setBounds(50, 100, 400, 30);
        comboBox.setFont(new Font("Poppins", Font.BOLD, 20));
        comboBox.setForeground(new Color(0x1C2538));
        panel.add(comboBox);

        // Create a button
        JButton button = new JButton("Submit");
        button.setBounds(50, 150, 400, 30);
        button.setFont(new Font("Poppins", Font.BOLD, 20));
        button.setForeground(new Color(0x1C2538));
        button.setBackground(new Color(0xFFFFFF));
        panel.add(button);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(50, 400, 400, 30);
        textField.setFont(new Font("Poppins", Font.BOLD, 20));
        textField.setForeground(new Color(0x1C2538));
        textField.setBackground(new Color(0xFFFFFF));
        panel.add(textField);

        // Create an action listener
        ActionListener actionListener = event -> {
            String selectedLanguage = (String) comboBox.getSelectedItem();
            textField.setText(selectedLanguage);
        };

        // Add action listener to the button
        button.addActionListener(actionListener);

        // Make the frame visible
        frame.setVisible(true);
}}


