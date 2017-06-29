package FinalExamPreparation.FileContentsToTextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JTextArea area = new JTextArea();
        frame.add(area, BorderLayout.CENTER);

        JButton choose_file = new JButton("Choose File");
        choose_file.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);

                if (value == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        FileReader reader = new FileReader(file);
                        Scanner in = new Scanner(reader);

                        area.setText("");

                        while (in.hasNextLine()) {
                            area.append(in.nextLine() + "\n");
                        }

                        reader.close();
                    } catch (IOException err) {
                        System.out.println("Error" + err.getMessage());
                    }

                }
            }
        });

        frame.add(choose_file, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
