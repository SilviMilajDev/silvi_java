package Seminari14.Ushtrimi1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel display_panel = new JPanel(null);
        display_panel.setBounds(0, 0, 400, 300);
        display_panel.setBackground(Color.RED);

        frame.add(display_panel);

        JPanel buttons_panel = new JPanel(null);
        buttons_panel.setBounds(0, 300, 400, 100);
        buttons_panel.setBackground(Color.WHITE);

        JButton red = new JButton("R");
        red.setBounds(0, 0, 133, 62);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.RED);
            }
        });

        buttons_panel.add(red);

        JButton green = new JButton("G");
        green.setBounds(133, 0, 133, 62);

        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.GREEN);
            }
        });

        buttons_panel.add(green);

        JButton blue = new JButton("B");
        blue.setBounds(266, 0, 133, 62);

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.BLUE);
            }
        });

        buttons_panel.add(blue);

        frame.add(buttons_panel);

        frame.setVisible(true);
    }
}
