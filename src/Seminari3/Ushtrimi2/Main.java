package Seminari3.Ushtrimi2;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        TargetComponent target = new TargetComponent();
        frame.add(target);
    }
}
