package Experiments.FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JLabel name_label = new JLabel("Name");
        frame.add(name_label);

        JTextField name = new JTextField(15);
        frame.add(name);

        JButton send = new JButton("Send");
        frame.add(send);

        frame.setVisible(true);
    }
}
