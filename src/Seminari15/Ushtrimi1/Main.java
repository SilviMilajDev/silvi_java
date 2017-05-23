package Seminari15.Ushtrimi1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Applikacion grafik per klasen BankAccount
 * Applikacioni permaban JTextField ku do te vendoset shuma dhe dy butona
 * withdraw dhe deposit. Qe do te bejne veprimet perkatese:
 * Veprimet do te kryhen mbi nje llogari me nje balance fillestare 1000
 * Ne nje label do te afishohet balanca ne cdo moment
 * Ndersa ne nje JTextArea te pa editueshme do te shkruahet gjithe historiku i transaksioneve te kryera
 */
public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel control = new JPanel(new GridLayout(2, 2));

        BankAccount account = new BankAccount(1000);

        JLabel balanca = new JLabel("Balanca: " + account.getBalance());
        control.add(balanca);

        JTextField shuma = new JTextField();
        control.add(shuma);

        JTextArea historiku = new JTextArea();
        historiku.setEditable(false);
        JScrollPane scroll_historiku = new JScrollPane(historiku);

        JButton deposit = new JButton("Depozito");
        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double vlera = Double.parseDouble(shuma.getText());
                account.deposit(vlera);
                balanca.setText("Balanca: " + account.getBalance());
                historiku.append("U depozituar shuma prej: " + vlera + "\n");
            }
        });
        control.add(deposit);

        JButton terhiq = new JButton("Terhiq");
        terhiq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double vlera = Double.parseDouble(shuma.getText());
                account.witdraw(vlera);
                balanca.setText("Balanca: " + account.getBalance());
                historiku.append("U terhoq shuma prej: " + vlera + "\n");
            }
        });
        control.add(terhiq);

        frame.add(control);
        frame.add(scroll_historiku);

        frame.setVisible(true);
    }
}
