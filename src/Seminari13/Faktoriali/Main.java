package Seminari13.Faktoriali;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextField faktoriali = new JTextField();
        faktoriali.setEditable(false);
        faktoriali.setBounds(10, 10, 200, 30);

        JTextField vlera = new JTextField();
        vlera.setBounds(10, 50, 200, 30);

        JButton llogarit = new JButton("Faktoriali");
        llogarit.setBounds(10, 100, 200, 30);
        llogarit.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(vlera.getText());
                faktoriali.setText("" + llogarit_faktorialin(v));
            }
        });

        frame.add(faktoriali);
        frame.add(vlera);
        frame.add(llogarit);

        frame.setVisible(true);
    }

    private static long llogarit_faktorialin(int nr) {
        if (nr <= 1) return 1;
        return nr * llogarit_faktorialin( nr - 1 );
    }
}
