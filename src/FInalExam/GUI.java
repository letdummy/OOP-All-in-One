package FInalExam;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        GUI gui = new GUI();
    }

    public GUI(){
        JFrame frame = new JFrame("tes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0, 0, 500, 500);
        frame.add(tabbedPane);

        JPanel panel1 = new JPanel();
        tabbedPane.addTab("Output Question 1", panel1);
        panel1.setLayout(null);
        Staff staff = new Staff("Agus Ardiansyah Nh", "L200214197");
        JLabel label1 = new JLabel();
        label1.setBounds(80, 50, 400, 30);
        label1.setFont(new Font("Poppins", Font.BOLD, 20));
        label1.setForeground(new Color(0x1C2538));
        label1.setText(staff.showOutput());
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        tabbedPane.addTab("Output Question 2", panel2);
        panel2.setLayout(null);
        Motorcycle.MotorSport motorSport = new Motorcycle.MotorSport("Honda");
        JLabel label2 = new JLabel();
        label2.setBounds(10, -70, 300, 300);
        label2.setFont(new Font("Poppins", Font.BOLD, 20));
        label2.setForeground(new Color(0x1C2538));
        label2.setText(String.format("<html>%s <br/> %s <br/> %s <br/> %s</html>",
                motorSport.showOutput(), motorSport.shiftUp(), motorSport.shiftDown(), motorSport.shiftDown()));
        panel2.add(label2);

        frame.setVisible(true);
    }
}
