package Seminari14.Ushtrimi2;

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

        JPanel buttons_panel = new JPanel(new GridLayout(1, 3));
        buttons_panel.setBounds(0, 300, 400, 100);
        buttons_panel.setBackground(Color.WHITE);

        ButtonGroup radio_group = new ButtonGroup();

        JRadioButton red = new JRadioButton("R");
        red.setSelected(true);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.RED);
            }
        });

        buttons_panel.add(red);

        JRadioButton green = new JRadioButton("G");

        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.GREEN);
            }
        });

        buttons_panel.add(green);

        JRadioButton blue = new JRadioButton("B");

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_panel.setBackground(Color.BLUE);
            }
        });

        radio_group.add(blue);
        radio_group.add(green);
        radio_group.add(red);

        buttons_panel.add(blue);

        frame.add(buttons_panel);

        frame.setVisible(true);
    }
}
