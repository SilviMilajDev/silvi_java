package Leksionet.Leksioni2_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");

        class MyListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Time: " + System.currentTimeMillis());
            }
        }

        MyListener listener = new MyListener();

        button.addActionListener(listener);

        Timer t = new Timer(1000, listener);
        t.start();

        frame.setVisible(true);
    }
}
