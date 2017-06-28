package Seminari18.Ushtrimi4;

/**
 * Metode rekursive per te kerkuar nje fjale ne nje fraze
 */
public class Main {
    public static void main(String[] args)
    {
        Sentence s = new Sentence("Mississippi");
       if (s.find("ppi")) {
           System.out.println("Fjala u gjet");
       } else {
           System.out.println("Fjala nuk u gjet");
       }
    }
}
