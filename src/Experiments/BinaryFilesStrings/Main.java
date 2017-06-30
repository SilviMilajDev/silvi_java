package Experiments.BinaryFilesStrings;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        writeContent();
        readContent();
    }

    private static void writeContent() {
        try {
            OutputStream out_stream = new FileOutputStream("src/Experiments/BinaryFilesStrings/text.bin");
            OutputStreamWriter output = new OutputStreamWriter(out_stream, "UTF-8");

            output.write("Testing Sentence");

            output.write(" Another Sentence");

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File was not closed: " + e.getMessage());
        }
    }

    private static void readContent() {
        try {
            InputStream in_stream = new FileInputStream("src/Experiments/BinaryFilesStrings/text.bin");
            InputStreamReader in = new InputStreamReader(in_stream, "UTF-8");

            int v = in.read();
            while(v != -1) {
                System.out.print((char) v);
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
