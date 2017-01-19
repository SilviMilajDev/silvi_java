package Seminari6.Liber;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String autor_emer, autor_mbiemer, autor_email,
            botuesi_emer, botuesi_adresa,
            liber_titulli, liber_zhanri;
        double liber_cmimi;

        int numri_autoreve;
        ArrayList<Autor> autoret = new ArrayList<>();
        Autor autor;
        String autor_id;

        System.out.print("Vendosni sa autore ka libri: ");
        numri_autoreve = in.nextInt();

        // Consuming Next Line
        String consuming_next_line = in.nextLine();

        for (int i = 1; i <= numri_autoreve; i++) {
            System.out.print("Vendosni emrin e autorit "+i+": ");
            autor_emer = in.nextLine();

            System.out.print("Vendosni mbiemrin e autorit "+i+": ");
            autor_mbiemer = in.nextLine();

            System.out.print("Vendosni emailin e autorit "+i+": ");
            autor_email = in.nextLine();

            autor_id = UUID.randomUUID().toString().replaceAll("-", "");

            autor = new Autor(autor_id, autor_emer, autor_mbiemer, autor_email);
            autoret.add(autor);
        }

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

        String botuesi_id = UUID.randomUUID().toString().replaceAll("-", "");

        Botuesi botuesi = new Botuesi(botuesi_id, botuesi_emer, botuesi_adresa);

        String liber_id = UUID.randomUUID().toString().replaceAll("-", "");

        Liber liber = new Liber(liber_id, liber_titulli, liber_zhanri, autoret, botuesi, liber_cmimi);

        System.out.println(
            "Titulli i Librit: "+ liber.getTitulli() + "\n"
            + "Autoret:"
        );

        for (int i = 0; i < liber.getAutoret().size(); i++) {
            System.out.println(" - " + liber.getAutoret().get(i).getEmer() + " " + liber.getAutoret().get(i).getMbiemer());
        }

        System.out.println("Adresa e Shtepise Botuese: " + liber.getBotuesi().getAdresa());
    }
}
