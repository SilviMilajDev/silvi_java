package Seminari13.Counter;

import javax.swing.*;
import java.awt.event.*;

public class Main
{
    private static int counter = 0;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JLabel text = new JLabel("Counter");
        text.setBounds(10, 10, 100, 20);
        frame.add(text);

        JTextField field = new JTextField();
        field.setEditable(false);
        field.setText("" + counter);
        field.setBounds(80, 10, 130, 20);
        frame.add(field);

        JButton increment = new JButton("Count");
        increment.setBounds(220, 10, 80, 20);
        increment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                field.setText("" + counter);
            }
        });
        frame.add(increment);
        frame.setVisible(true);
    }
}
