package Leksionet.Leksioni2_4.FileChooser;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        JFileChooser file = new JFileChooser();
        FileReader in;
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selected_file = file.getSelectedFile();
            in = new FileReader(selected_file);
            Scanner input = new Scanner(in);

            while(input.hasNextLine()) {
                String text = input.nextLine();
                System.out.println(text);
            }

            in.close();
        }
    }
}
