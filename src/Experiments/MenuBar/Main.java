package Experiments.MenuBar;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));

        file.add(open);
        file.add(save);
        file.add(exit);

        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");

        menu.add(file);
        menu.add(edit);
        menu.add(view);

        frame.setJMenuBar(menu);

        frame.setVisible(true);
    }
}
