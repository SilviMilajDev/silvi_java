package Seminari2.Ushtrimi2;

public class Main
{
    public static void main(String[] args)
    {
        String str = "Reverse me";
        String rev_str = "";

        for (int i = str.length()-1; i >= 0; i--) {
            rev_str += str.charAt(i);
        }

        System.out.println(rev_str);
    }
}
