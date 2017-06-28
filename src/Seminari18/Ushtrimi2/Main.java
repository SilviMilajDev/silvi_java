package Seminari18.Ushtrimi2;

import java.util.Scanner;

/**
 * Gjej faktorialin ne menyre rekursive
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Vendosni vleren: ");
        int value = in.nextInt();
        System.out.println("Faktoriali: " + faktoriali(value));
    }

    private static int faktoriali(int nr) {
        if (nr < 2) return 1;

        return nr * faktoriali(nr - 1);
    }
}
