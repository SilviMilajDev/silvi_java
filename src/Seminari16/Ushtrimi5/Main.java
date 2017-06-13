package Seminari16.Ushtrimi5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ndertoni nje program ku perdoruesi jep vleren dhe do kete dy JComboBox
 * ne te cilen percaktorhet monedha dhe shfaqe rezultatin e konvertimit
 */
public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String monedhat[] = { "LEK", "EUR", "USD" };

        JComboBox<String> monedha1 = new JComboBox<>(monedhat);
        monedha1.setBounds(10, 10, 150, 20);
        frame.add(monedha1);

        JComboBox<String> monedha2 = new JComboBox<>(monedhat);
        monedha2.setBounds(220, 10, 150, 20);
        frame.add(monedha2);

        JTextField shuma1 = new JTextField();
        shuma1.setBounds(10, 40, 150, 30);
        frame.add(shuma1);

        JTextField shuma2 = new JTextField();
        shuma2.setEditable(false);
        shuma2.setBounds(220, 40, 150, 30);
        frame.add(shuma2);

        JButton konverto = new JButton("Konverto");
        konverto.setBounds(10, 90, 360, 30);
        konverto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sasia = Double.parseDouble(shuma1.getText());

                    double rate = 1;

                    if (monedha1.getSelectedItem() == "LEK" && monedha2.getSelectedItem() == "EUR") {
                        rate = 0.7;
                    } else if (monedha1.getSelectedItem() == "LEK" && monedha2.getSelectedItem() == "USD") {
                        rate = 0.9;
                    } else if (monedha1.getSelectedItem() == "USD" && monedha2.getSelectedItem() == "LEK") {
                        rate = 1.1;
                    } else if (monedha1.getSelectedItem() == "USD" && monedha2.getSelectedItem() == "EUR") {
                        rate = 0.8;
                    } else if (monedha1.getSelectedItem() == "EUR" && monedha2.getSelectedItem() == "USD") {
                        rate = 1.2;
                    } else if (monedha1.getSelectedItem() == "EUR" && monedha2.getSelectedItem() == "LEK") {
                        rate = 1.4;
                    }

                    shuma2.setText("" + (sasia * rate));
                } catch (NumberFormatException err) {
                    //
                }
            }
        });
        frame.add(konverto);

        frame.setVisible(true);
    }
}
