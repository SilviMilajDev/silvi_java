package Seminari16.Ushtrimi1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ka dy textarea dhe nje button.
 * Ne klikim te buttonit, teksti i selektuar nga textarea e 1 do te kalohet tek textarea 2
 */
public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);

        JTextArea area1 = new JTextArea();
        area1.setBounds(10, 10, 250, 400);

        frame.add(area1);

        JTextArea area2 = new JTextArea();
        area2.setBounds(370, 10, 250, 400);

        frame.add(area2);

        JButton button = new JButton(">>");
        button.setBounds(290, 240, 50, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area1.getSelectedText();
                area2.append(text);
            }
        });

        frame.add(button);

        frame.setVisible(true);
    }
}
