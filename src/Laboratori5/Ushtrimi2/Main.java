package Laboratori5.Ushtrimi2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        FileReader reader;
        try {
            reader = new FileReader("src/Laboratori5/Ushtrimi2/studentet.txt");
            FileWriter out = new FileWriter("src/Laboratori5/Ushtrimi2/out.txt");

            Scanner in = new Scanner(reader);
            int counter = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();

                if ( ! line.equals("") ) {
                    String to_append = line.split("=")[1].trim() + " ";
                    out.append(to_append);
                    if (++counter > 3) {
                        counter = 1;
                        out.append("\n");
                    }
                }
            }

            reader.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Skedari nuk u gjet");
        } catch (IOException e) {
            System.out.println("Output file not found");
        }
    }
}
