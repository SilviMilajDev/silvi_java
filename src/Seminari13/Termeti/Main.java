package Seminari13.Termeti;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ndertoni nje klase qe pershkruan efektet e nje termeti
 * kontstruktori merr si parameter magnituden e termetit, e cila karakterizon forcen e termetit
 * Implementoni metoden getDescription() e cila ne varesi te magnitudes kthen nje string qe
 * pershkruan demet e termetit.
 * 2) Implementoni nje program grafik qe shfaq nje frame si ne figure. Kur klikohet butoni shfaq
 *    te Rezultati pershkrimin e demeve
 *      ------------------------
 *      |           ---------  |
 *      | Magnituda |       |  |
 *      |           ---------  |
 *      |           [ Shfaq ]  |
 *      | -------------------- |
 *      | |                  | |
 *      | |    Rezulatati    | |
 *      | |                  | |
 *      | -------------------- |
 *      ------------------------
 */

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JLabel magn = new JLabel("Magnituda");
        magn.setBounds(40, 40, 100, 30);

        JTextField value = new JTextField();
        value.setBounds(120, 40, 100, 30);

        JTextArea rezultati = new JTextArea();
        rezultati.setBounds(10, 130, 265, 200);
        rezultati.setEditable(false);
        rezultati.setLineWrap(true);
        rezultati.setWrapStyleWord(true);

        JButton shfaq = new JButton("Shfaq");
        shfaq.setBounds(120, 80, 100, 40);
        shfaq.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt( value.getText() );
                Termeti termet = new Termeti(v);
                rezultati.setText( termet.getDescription() );
            }
        });

        frame.add(magn);
        frame.add(value);
        frame.add(shfaq);
        frame.add(rezultati);

        frame.setVisible(true);
    }
}
