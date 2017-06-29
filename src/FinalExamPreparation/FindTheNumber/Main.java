package FinalExamPreparation.FindTheNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    private static int selected_number;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gjeneroNumrin();

        JLabel game_info = new JLabel("Kam nje numer nga 1 ne 1000. A mund ta gjesh numrin tim?");
        frame.add(game_info);

        JLabel status = new JLabel("Vendosni nje vlere");
        frame.add(status);

        JTextField vlera = new JTextField();
        frame.add(vlera);

        JButton get_vlera = new JButton("Kontrollo vleren");
        get_vlera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int number = Integer.parseInt(vlera.getText());

                if (number < selected_number) {
                    frame.getContentPane().setBackground(Color.RED);
                    return;
                }

                if (number > selected_number) {
                    frame.getContentPane().setBackground(Color.BLUE);
                    return;
                }

                frame.getContentPane().setBackground(Color.LIGHT_GRAY);
                status.setText("Korrekt");
                vlera.setEditable(false);
            }
        });
        frame.add(get_vlera);

        JButton restart = new JButton("Luaj Perseri");
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vlera.setEditable(true);
                vlera.setText("");
                status.setText("Vendosni nje vlere");
                frame.getContentPane().setBackground(Color.LIGHT_GRAY);
                gjeneroNumrin();
            }
        });

        frame.add(restart);

        frame.setVisible(true);
    }

    private static void gjeneroNumrin() {
        Random rand = new Random();
        int min = 1, max = 1000;

        selected_number = rand.nextInt((max - min) + 1) + min;
        System.out.println(selected_number);
    }
}
