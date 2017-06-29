package Leksionet.Leksioni2_6.PanelsOverlay;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel1 = new JPanel(new BorderLayout());

        JTextField field = new JTextField();
        panel1.add(field, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel(new GridLayout(4, 3));

        JButton seven = new JButton("7");
        panel2.add(seven);

        JButton eight = new JButton("8");
        panel2.add(eight);

        JButton nine = new JButton("9");
        panel2.add(nine);

        JButton four = new JButton("4");
        panel2.add(four);

        JButton five = new JButton("5");
        panel2.add(five);

        JButton six = new JButton("6");
        panel2.add(six);

        JButton one = new JButton("1");
        panel2.add(one);

        JButton two = new JButton("2");
        panel2.add(two);

        JButton three = new JButton("3");
        panel2.add(three);

        JButton zero = new JButton("0");
        panel2.add(zero);

        JButton point = new JButton(".");
        panel2.add(point);

        JButton clear = new JButton("CE");
        panel2.add(clear);

        frame.add(panel2, BorderLayout.CENTER);


        frame.setVisible(true);
    }
}
