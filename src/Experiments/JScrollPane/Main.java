package Experiments.JScrollPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JTextArea text = new JTextArea();
        text.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(text);
        frame.add(scroll, BorderLayout.CENTER);

        JButton fill = new JButton("Fill");
        fill.addActionListener( e -> {
            for (int i = 0; i < 50; i++) {
                text.append("THis is a dummy sentence");
            }
        });
        frame.add(fill, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
