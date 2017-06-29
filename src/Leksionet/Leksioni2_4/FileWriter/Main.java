package Leksionet.Leksioni2_4.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("src/Leksionet/Leksioni2_4/FileWriter/text.txt");
        file.write("Testing Sentence.");
        file.close();
    }
}
