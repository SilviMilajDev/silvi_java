package Laboratori3.Ushtrimi1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try {
            File file = new File("./README.md");
            if (file.exists()) {
                FileReader f_reader = new FileReader("./README.md");
                Scanner in = new Scanner(f_reader);
                int chars = -1, words = 0, lines = 0;
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    lines++;
                    chars++;
                    if (line.equals("\n")) {
                        continue;
                    }
                    String words_array[] = line.split(" ");
                    for (int i = 0; i < words_array.length; i++) {
                        if (words_array[i].equals("")) continue;
                        words++;
                    }
                    chars += line.length();
                }
                System.out.println(
                    "Charaters: " + chars + "\n" +
                    "Words: " + words + "\n" +
                    "Lines: " + lines
                );
                f_reader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch (IOException e) {
            System.out.println("File was not closed.");
        }
    }
}
