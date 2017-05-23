package Seminari15.Ushtrimi2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Shkruani nje applikacion qe permban 3 textfielde 1 per vleren fillestare te balances
 * per nje savingsAccount. Nje per vleren e interesit dhe nje per numrin e viteve
 * Shtoni nje button llogarit dhe nje Jtextarea te paeditueshme qe do te shfaqe balancen e savings account
 * per cdo vit
 */
public class Main
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel control = new JPanel(new GridLayout(3,2));

        JLabel balanca_fillestare_label = new JLabel("Balanca Fillestare:");
        control.add(balanca_fillestare_label);

        JTextField balanca_fillestare = new JTextField();
        control.add(balanca_fillestare);

        JLabel interesi_label = new JLabel("Interesi:");
        control.add(interesi_label);

        JTextField interesi = new JTextField();
        control.add(interesi);

        JTextArea balancat = new JTextArea();
        balancat.setEditable(false);

        JButton llogarit = new JButton("Llogarit");
        llogarit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                balancat.setText("");
                double vlera_fillestare = Double.parseDouble(balanca_fillestare.getText());
                double interesi_vendosur = Double.parseDouble(interesi.getText());
                double vlera_e_fundit = vlera_fillestare;
                for (int i = 1; i <= 10; i++) {
                    vlera_e_fundit += interesi_vendosur * vlera_e_fundit;
                    balancat.append("Pas " + i + " viti/esh: " + vlera_e_fundit + "\n");
                }
            }
        });
        control.add(llogarit);

        frame.add(control);
        frame.add(balancat);

        frame.setVisible(true);
    }
}
