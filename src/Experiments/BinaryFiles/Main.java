package Experiments.BinaryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        writeContent();
        readContent();
    }

    private static void writeContent() {
        try {
            FileOutputStream output = new FileOutputStream("src/Experiments/BinaryFiles/text.bin");

            byte b = (byte) 20;
            output.write(b);

            b = (byte) 145;
            output.write(b);

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File was not closed: " + e.getMessage());
        }
    }

    private static void readContent() {
        try {
            FileInputStream in = new FileInputStream("src/Experiments/BinaryFiles/text.bin");

            int v = in.read();
            while(v != -1) {
                System.out.println(v);
                v = in.read();
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File was not closed: " + e.getMessage());
        }
    }
}
