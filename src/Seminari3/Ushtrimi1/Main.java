package Seminari3.Ushtrimi1;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

        FlagComponent flag = new FlagComponent();
        frame.add(flag);
    }
}
