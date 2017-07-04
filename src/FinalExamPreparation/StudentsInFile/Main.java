package FinalExamPreparation.StudentsInFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String destination = "src/FinalExamPreparation/StudentsInFile/students.txt";

        try {
            FileWriter writer = new FileWriter(destination);

            while (true) {
                System.out.println("Vendos te dhenat e studentit");

                System.out.print("Vendos Emrin: ");
                String emri = in.nextLine();

                if (emri.equals("-1")) break;

                System.out.print("Vendos Mbiemrin: ");
                String mbiemri = in.nextLine();

                System.out.print("Vendos Mesataren: ");
                double mesatarja = in.nextDouble();
                in.nextLine();

                writer.write(emri + " ");
                writer.write(mbiemri + " ");
                writer.write(mesatarja + "\n");
            }

            writer.close();

            // Leximi
            FileReader reader = new FileReader(destination);
            Scanner read = new Scanner(reader);

            System.out.println("Vendosni emrin e studentit");
            String studenti = in.nextLine();

            double mes = -1;
            boolean found = false;
            while(read.hasNextLine()) {
                String name = read.next() + " " + read.next();

                if (name.equals(studenti)) {
                    if (found) {
                        found = false;
                        System.out.println("Ka dy student me te njejtin emer");
                    }
                    found = true;
                    mes = read.nextDouble();
                    read.next();
                } else {
                    read.nextLine();
                }
            }

            if (!found)
                System.out.println("Studenti nuk ekziston");

            if (found && mes != -1) {
                System.out.println("Mesatarja e studentit: " + mes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
