package Laboratori5.Ushtrimi1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try {
            FileReader reader = new FileReader("src/Laboratori5/Ushtrimi1/skedari.txt");
            Scanner in = new Scanner(reader);

            double shuma = 0;
            while( in.hasNext() ) {
                String vlera = in.next();
                double v;
                try {
                    v = Double.parseDouble(vlera);
                } catch (NumberFormatException e) {
                    v = 0;
                }
                shuma += v;
            }
            System.out.println("Shuma eshte: " + shuma);

        } catch (FileNotFoundException e) {
            System.out.println("Skedari nuk u gjet");
        }
    }
}
