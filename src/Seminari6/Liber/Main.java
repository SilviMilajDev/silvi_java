package Seminari6.Liber;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String autor_emer, autor_mbiemer, autor_email,
            botuesi_emer, botuesi_adresa,
            liber_titulli, liber_zhanri;
        double liber_cmimi;

        System.out.print("Vendosni emrin e autorit: ");
        autor_emer = in.nextLine();

        System.out.print("Vendosni mbiemrin e autorit: ");
        autor_mbiemer = in.nextLine();

        System.out.print("Vendosni emailin e autorit: ");
        autor_email = in.nextLine();

        System.out.print("Vendosni emrin e botuesit: ");
        botuesi_emer = in.nextLine();

        System.out.print("Vendosni adresen e botuesit: ");
        botuesi_adresa = in.nextLine();

        System.out.print("Vendosni titullin e librit: ");
        liber_titulli = in.nextLine();

        System.out.print("Vendosni zhanrin e librit: ");
        liber_zhanri = in.nextLine();

        System.out.print("Vendosni cmimin e librit: ");
        liber_cmimi = in.nextDouble();

        Autor autor = new Autor("IDasdsfs", autor_emer, autor_mbiemer, autor_email);

        Botuesi botuesi = new Botuesi("ID321442sa", botuesi_emer, botuesi_adresa);

        Liber liber = new Liber("ISBN1231asdas", liber_titulli, liber_zhanri, autor, botuesi, liber_cmimi);

        System.out.println(
            "Titulli i Librit: "+ liber.getTitulli() + "\n"
            + "Autori: " + liber.getAutor().getEmer() + " " + liber.getAutor().getMbiemer() + "\n"
            + "Adresa e Shtepise Botuese: " + liber.getBotuesi().getAdresa()
        );
    }
}
