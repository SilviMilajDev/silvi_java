package Seminari11.FileMerger;

import java.io.*;
import java.util.Scanner;

/**
 * Files:
 * file1.txt (input),
 * file2.txt (input),
 * out.txt (output)
 */

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendos file 1: ");
        String file1 = in.nextLine();
        System.out.print("Vendos file 2: ");
        String file2 = in.nextLine();

        try {
            try (FileReader in_file1 = new FileReader("src/Seminari11/FileMerger/" + file1)) {
                FileReader in_file2 = new FileReader("src/Seminari11/FileMerger/" + file2);

                FileWriter out = new FileWriter("src/Seminari11/FileMerger/out.txt");
                Scanner file_in = new Scanner(in_file1);
                while(file_in.hasNextLine()) {
                    out.write(file_in.nextLine() + "\n");
                }

                file_in = new Scanner(in_file2);
                while(file_in.hasNextLine()) {
                    out.write(file_in.nextLine() + "\n");
                }

                in_file1.close();
                in_file2.close();
                out.close();

            } catch (FileNotFoundException e) {
                System.out.println("File 1 was not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File 2 was not found.");
        } catch (IOException e) {
            System.out.println("File was not closed | " + e.getMessage());
        }
    }
}
