package Seminari11.NotALetterException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = in.nextLine();

        int index = -1;

        try{
            for (int i = 0; i < s.length(); i++) {
                if ( ! Character.isLetter(s.charAt(i))) {
                    throw new NotALetterException();
                }

                index = i;
            }
        } catch (NotALetterException e) {
            //
        }

        if ( ! s.equals("") ) {
            System.out.println("First char that is not a letter: " + s.charAt(index + 1));
            System.out.println("Characters that are letters: " + (index + 1));
        }
    }
}