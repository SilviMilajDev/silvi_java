package Seminari11.CharReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CharReader
{
    private int characters;
    private int lines;
    private int words;

    CharReader() {
        characters = 0;
        lines = 0;
        words = 0;
    }

    public void read(String file_name) {
        try {
            FileReader f = new FileReader(file_name);
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String[] s_words = s.split(" ");
                lines++;
                words = s_words.length;
                characters += s.length();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public int getWords() {
        return words;
    }

    public int getLines() {
        return lines;
    }

    public int getCharacters() {
        return characters;
    }
}
