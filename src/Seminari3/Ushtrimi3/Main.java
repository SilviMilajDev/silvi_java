package Seminari3.Ushtrimi3;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        EnvelopeComponent envelope = new EnvelopeComponent();
        frame.add(envelope);
    }
}
