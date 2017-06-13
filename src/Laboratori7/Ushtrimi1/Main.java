package Laboratori7.Ushtrimi1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel fields = new JPanel(null);
        fields.setBounds(0, 0, 250, 400);

        JLabel nr1_label = new JLabel("Nr1");
        nr1_label.setBounds(10, 10, 30, 20);

        JTextField nr1_field = new JTextField();
        nr1_field.setBounds(60, 10, 180, 20);

        JLabel nr2_label = new JLabel("Nr2");
        nr2_label.setBounds(10, 40, 30, 20);

        JTextField nr2_field = new JTextField();
        nr2_field.setBounds(60, 40, 180, 20);

        JLabel rez_label = new JLabel("Rez");
        rez_label.setBounds(10, 70, 30, 20);

        JTextField rez_field = new JTextField();
        rez_field.setEditable(false);
        rez_field.setBounds(60, 70, 180, 20);

        frame.add(fields);

        JButton add = new JButton("+");
        add.setBounds(260, 20, 60, 30);

        JButton sub = new JButton("-");
        sub.setBounds(260, 60, 60, 30);

        JButton mul = new JButton("*");
        mul.setBounds(260, 100, 60, 30);

        JButton div = new JButton("/");
        div.setBounds(260, 140, 60, 30);

        JButton clear = new JButton("Clear");
        clear.setBounds(30, 120, 200, 60);

        class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(nr1_field.getText());
                double b = Double.parseDouble(nr2_field.getText());
                Object source = e.getSource();

                if (source == add)
                    rez_field.setText("" + (a + b));
                else if (source == sub)
                    rez_field.setText("" + (a - b));
                else if (source == mul)
                    rez_field.setText("" + (a * b));
                else if (source == div)
                    rez_field.setText("" + (a / b));
                else if (source == clear) {
                    nr1_field.setText("");
                    nr2_field.setText("");
                    rez_field.setText("");
                }
            }
        }

        ActionListener listener = new MyListener();
        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);
        clear.addActionListener(listener);
        fields.add(nr1_label);
        fields.add(nr1_field);
        fields.add(nr2_label);
        fields.add(nr2_field);
        fields.add(rez_label);
        fields.add(rez_field);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        fields.add(clear);

        frame.setVisible(true);
    }
}
