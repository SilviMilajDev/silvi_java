package Seminari12.Square;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean valid = false;
        while(!valid) {
            valid = true;
            try {
                runProgram();
            } catch (InputMismatchException e) {
                System.out.println("Vendosni nje number te plote...");
                valid = false;
            }
        }
    }

    private static void runProgram() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Vendosni nje integer:");
        num = in.nextInt();
        System.out.println("Katrori i " + num + " eshte " + (num * num));
    }
}
