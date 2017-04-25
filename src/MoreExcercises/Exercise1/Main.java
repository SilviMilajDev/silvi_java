package MoreExcercises.Exercise1;

import java.util.Random;

/**
 * Shkruaj nje program qe gjeneron rastesisht 100 numra nga 0 - 9
 * dhe numero sa here gjenerohet cdo numer
 */

public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random();

        int counters[] = new int[10];

        for (int i = 0; i < 10; i++)
            counters[i] = 0;

        for (int i = 0; i < 100; i++) {
            int value = rand.nextInt(10);
            counters[value]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + counters[i]);
        }
    }
}
