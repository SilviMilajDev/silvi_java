package Seminari16.Ushtrimi2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Ka nje combobox e cila kur klikohet shfaq imazhin
 * NOTE:
 * Vendos imazhet
 */
public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        JComboBox<String> imazhet = new JComboBox<>();
        String[] imgs = { "imazhi1.jpg", "imazhi2.png" };
        for (String img : imgs)
            imazhet.addItem(img);

        JLabel imazhi = new JLabel(new ImageIcon("src/Seminari16/Ushtrimi2/" + imgs[0]));

        imazhet.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String img = e.getItem().toString();
                imazhi.setIcon(new ImageIcon("src/Seminari16/Ushtrimi2/" + img));
            }
        });

        frame.add(imazhet);
        frame.add(imazhi);

        frame.setVisible(true);
    }
}
