package Seminari14.Ushtrimi4;

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

        JComboBox<String> colors = new JComboBox<>();
        colors.setBounds(0, 0, 405, 60);
        colors.addItem("R");
        colors.addItem("G");
        colors.addItem("B");
        colors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected_color = (String) colors.getSelectedItem();
                if (selected_color.equals("R")) display_panel.setBackground(Color.RED);
                if (selected_color.equals("B")) display_panel.setBackground(Color.BLUE);
                if (selected_color.equals("G")) display_panel.setBackground(Color.GREEN);
            }
        });

        buttons_panel.add(colors);

        frame.add(buttons_panel);

        frame.setVisible(true);
    }
}
