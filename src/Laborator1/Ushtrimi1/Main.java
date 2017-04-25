package Laborator1.Ushtrimi1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static int counter = 0;
    private static JLabel label = new JLabel("" + counter);

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(240, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(100, 80, 100, 50);
        frame.add(label);

        JButton increment = new JButton("+1");
        JButton decrement = new JButton("-1");

        increment.setBounds(10, 10, 100, 50);
        decrement.setBounds(110, 10, 100, 50);

        increment.addActionListener( new Listener(1) );
        decrement.addActionListener( new Listener(-1) );

        frame.add(increment);
        frame.add(decrement);

        frame.setVisible(true);
    }

    private static class Listener implements ActionListener {

        private int val;

        Listener(int val) {
            this.val = val;
        }

        public void actionPerformed(ActionEvent e) {
            counter += val;
            label.setText("" + counter);
        }
    }
}
