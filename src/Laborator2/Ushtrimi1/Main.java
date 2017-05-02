package Laborator2.Ushtrimi1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextField result = new JTextField();
        result.setEditable(false);
        result.setLayout(null);
        result.setBounds(10, 10, 200, 30);

        JTextField numbers = new JTextField();

        JButton get_sum = new JButton("Sum");
        get_sum.setLayout(null);
        get_sum.setBounds(10, 100, 200, 30);

        JButton get_factorial = new JButton("Factorial");
        get_factorial.setLayout(null);
        get_factorial.setBounds(10, 140, 200, 30);

        numbers.setLayout(null);
        numbers.setBounds(10, 50, 200, 30);

        get_sum.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numbers.getText();
                int number = Integer.parseInt(num);

                int sum = 0;
                while (number != 0) {
                    sum += number % 10;
                    number /= 10;
                }

                result.setText("" + sum);
            }
        });

        get_factorial.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numbers.getText();
                int number = Integer.parseInt(num);

                long factorial = 1;
                while (number != 1 && number > 0) {
                    factorial *= number;
                    number--;
                }

                result.setText("" + factorial);
            }
        });

        frame.add(result);
        frame.add(numbers);
        frame.add(get_sum);
        frame.add(get_factorial);
        frame.setVisible(true);

    }
}
