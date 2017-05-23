package Laboratori4.Ushtrimi1;

import java.io.*;
import java.util.Scanner;

/**
 * Kopjon filen me te vogel tek me i madhi
 */

public class Main
{
    public static void main(String[] args)
    {
        File f1 = new File("src/Laboratori4/Ushtrimi1/file.txt");
        File f2 = new File("src/Laboratori4/Ushtrimi1/file2.txt");
        File biggest_file; File smallest_file;
        if (f1.length() > f2.length()) {
            biggest_file = f1;
            smallest_file = f2;
        } else {
            smallest_file = f1;
            biggest_file = f2;
        }

        try {
            FileReader fStream1 = new FileReader(smallest_file);
            try {
                FileWriter fstream2 = new FileWriter(biggest_file, true);
                Scanner in = new Scanner(fStream1);
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    fstream2.append(line);
                }
                fStream1.close();
                fstream2.close();

            } catch (IOException e) {
                System.out.println("Output Exception");
                fStream1.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Smallest File was not found");
        } catch (IOException e) {
            System.out.println("File was not closed");
        }
    }
}
