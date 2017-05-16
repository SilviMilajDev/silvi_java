package Laboratori4.Ushtrimi1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Kopjon filen me te vogel tek me i madhi
 */

public class Main
{
    public static void main(String[] args)
    {
        File f1 = new File("file.txt");
        File f2 = new File("file2.txt");
        File biggest_file; File smallest_file;
        if (f1.length() > f2.length()) {
            biggest_file = f1;
            smallest_file = f2;
        } else {
            smallest_file = f1;
            biggest_file = f2;
        }

//        try {
//            FileReader fStream1 = new FileReader(smallest_file);
//            FileWriter fstream2 = new FileWriter()
//        } catch (FileNotFoundException e) {
//            System.out.println("Smallest File was not found");
//        }
    }
}
