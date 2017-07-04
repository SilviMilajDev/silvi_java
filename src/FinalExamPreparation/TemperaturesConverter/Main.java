package FinalExamPreparation.TemperaturesConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel temperatura = new JLabel("Vendosni temperaturen");
        frame.add(temperatura);

        JTextField temp = new JTextField();
        frame.add(temp);

        JLabel konverto_nga = new JLabel("Koverto nga");
        frame.add(konverto_nga);

        JComboBox<String> nga = new JComboBox<>();
        nga.addItem("Grade Celcius");
        nga.addItem("Farenheid");

        frame.add(nga);

        JLabel konverto_ne = new JLabel("Konverto ne");
        frame.add(konverto_ne);

        JComboBox<String> ne = new JComboBox<>();
        ne.addItem("Farenheid");
        ne.addItem("Grade Celcius");

        frame.add(ne);

        JTextField rezultati = new JTextField();
        rezultati.setEditable(false);

        JButton konverto = new JButton("Konverto");
        konverto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a = (String) nga.getSelectedItem();
                String b = (String) ne.getSelectedItem();
                if (
                    a.equals("Grade Celcius") && b.equals("Grade Celcius") ||
                    a.equals("Farenheid") && b.equals("Farenheid")
                )
                    rezultati.setText(temp.getText());

                if (a.equals("Grade Celcius") && b.equals("Farenheid"))
                    rezultati.setText((Double.parseDouble(temp.getText()) * 1.2) + "");

                if (b.equals("Grade Celcius") && a.equals("Farenheid"))
                    rezultati.setText((Double.parseDouble(temp.getText()) / 1.2) + "");
            }
        });
        frame.add(konverto);

        frame.add(rezultati);

        frame.setVisible(true);
    }
}
