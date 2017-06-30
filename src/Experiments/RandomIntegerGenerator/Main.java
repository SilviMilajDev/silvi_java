package Experiments.RandomIntegerGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int max = 6;
        int min = 1;

        System.out.println("nextInt(6)");
        for (int i = 0; i < 20; i++) {
            /* Generates numbers from 0 - 5 */
            System.out.println(rand.nextInt(max));
        }

        System.out.println("nextInt(6 - 1 + 1) + 1");
        for (int i = 0; i < 20; i++) {
            /* Generates numbers from 1 - 6 */
            System.out.println(rand.nextInt(max - min + 1) + min);
        }
    }
}
