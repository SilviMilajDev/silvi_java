package Seminari14.Ushtrimi3;

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

        JCheckBox red = new JCheckBox("R");
        red.setSelected(true);

        JCheckBox green = new JCheckBox("G");

        JCheckBox blue = new JCheckBox("B");

        class ColorChanger implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                int r = 0, g = 0, b = 0;
                if (red.isSelected()) r = 255;
                if (blue.isSelected()) b = 255;
                if (green.isSelected()) g = 255;

                display_panel.setBackground(new Color(r,g,b));
            }
        }



        red.addActionListener(new ColorChanger());

        buttons_panel.add(red);

        green.addActionListener(new ColorChanger());

        buttons_panel.add(green);

        blue.addActionListener(new ColorChanger());

        buttons_panel.add(blue);

        frame.add(buttons_panel);

        frame.setVisible(true);
    }
}
