package Seminari8.Tree;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many rectangles do you want"));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        TreeComponent tree = new TreeComponent(n);
        frame.add(tree);
    }
}
