package module_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
    }

    static JCheckBox checkBoxRed, checkBoxGreen, checkBoxBlue;
    public CheckBox(){
        // Create a frame
        JFrame frame = new JFrame("CheckBox");
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
        JLabel label = new JLabel("Choose your background color");
        label.setBounds(50, 50, 400, 30);
        label.setFont(new Font("Poppins", Font.BOLD, 20));
        label.setForeground(new Color(0xFFFFFF));
        panel.add(label);

        // Create a check box for red color
        checkBoxRed = new JCheckBox("Red");
        checkBoxRed.setBounds(50, 100, 400, 30);
        checkBoxRed.setFont(new Font("Poppins", Font.BOLD, 20));
        checkBoxRed.setForeground(new Color(0x1C2538));
        checkBoxRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(0xFF0000));
                checkBoxGreen.setSelected(false);
                checkBoxBlue.setSelected(false);
            }
        });
        panel.add(checkBoxRed);

        // Create a check box for red color
        checkBoxGreen = new JCheckBox("Green");
        checkBoxGreen.setBounds(50, 150, 400, 30);
        checkBoxGreen.setFont(new Font("Poppins", Font.BOLD, 20));
        checkBoxGreen.setForeground(new Color(0x1C2538));
        checkBoxGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(0x00FF00));
                checkBoxRed.setSelected(false);
                checkBoxBlue.setSelected(false);
            }
        });
        panel.add(checkBoxGreen);

        // Create a check box for red color
        checkBoxBlue = new JCheckBox("Blue");
        checkBoxBlue.setBounds(50, 200, 400, 30);
        checkBoxBlue.setFont(new Font("Poppins", Font.BOLD, 20));
        checkBoxBlue.setForeground(new Color(0x1C2538));
        checkBoxBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(0x0000FF));
                checkBoxRed.setSelected(false);
                checkBoxGreen.setSelected(false);
            }
        });
        panel.add(checkBoxBlue);


        // Create a button
        JButton button = new JButton("Reset");
        button.setBounds(50, 400, 400, 30);
        button.setFont(new Font("Poppins", Font.BOLD, 20));
        button.setForeground(new Color(0x1C2538));
        button.setBackground(new Color(0xFFFFFF));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(0x1C2538));
                checkBoxRed.setSelected(false);
                checkBoxGreen.setSelected(false);
                checkBoxBlue.setSelected(false);
            }
        });
        panel.add(button);


        // Show the frame
        frame.setVisible(true);
    }
}
