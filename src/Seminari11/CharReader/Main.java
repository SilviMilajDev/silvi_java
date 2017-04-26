package Seminari11.CharReader;

public class Main
{
    public static void main(String[] args)
    {
        CharReader reader = new CharReader();
        reader.read("src/Seminari11/CharReader/test.txt");
        System.out.println("Characters: " + reader.getCharacters());
        System.out.println("Lines: " + reader.getLines());
        System.out.println("Words: " + reader.getWords());
    }
}
