package MoreExcercises.Exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * Nderto nje program qe zgjedh nje fjale nga nje vektor dhe i kerkon
 * perdoruesit te gjeje fjalen e zgjedhur rastesisht duke kerkuar me karaktere
 */
public class Main {
    public static void main(String[] args)
    {
        String fjalet[] = {
            "mali",
            "biciklete",
            "makine",
            "maune"
        };

        Random rand = new Random();

        int indeksi = rand.nextInt(fjalet.length);

        char karakteret[] = new char[36];
        int last_char_index = 0;

        Scanner in = new Scanner(System.in);

        while ( true ) {
            boolean char_in_list = false;

            System.out.print("Vendos Karakterin: ");

            char k = in.nextLine().charAt(0);
            for ( char ch : karakteret ) {
                if (k == ch) {
                    char_in_list = true;
                    break;
                }
            }

            if ( ! char_in_list ) {
                karakteret[last_char_index++] = k;
            }

            String fjala = "";
            int characters_found = 0;
            for (int i = 0; i < fjalet[indeksi].length(); i++) {
                boolean char_found = false;
                for (int j = 0; j < last_char_index; j++) {
                    if ( fjalet[indeksi].charAt(i) == karakteret[j] ) {
                        char_found = true;
                        break;
                    }
                }

                if (char_found) characters_found++;

                fjala += (char_found) ? fjalet[indeksi].charAt(i) + " " : "* ";
            }

            System.out.println("Fjala: " + fjala);

            if (characters_found == fjalet[indeksi].length()) break;
        }

        System.out.println("Word Found");
    }
}
