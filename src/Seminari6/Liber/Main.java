package Seminari6.Liber;

public class Main
{
    public static void main(String[] args)
    {
        Autor autor = new Autor("IDasdsfs", "Emer", "Mbiemer", "emer_mbiemer@email.com");

        Botuesi botuesi = new Botuesi("ID321442sa", "Shtepia Botuese", "Rr. e Shtepise Botuese");

        Liber liber = new Liber("ISBN1231asdas", "Titulli", "Zhanri", autor, botuesi, 12.4);

        System.out.println(
            "Titulli i Librit: "+ liber.getTitulli() + "\n"
            + "Autori: " + liber.getAutor().getEmer() + " " + liber.getAutor().getMbiemer() + "\n"
            + "Adresa e Shtepise Botuese: " + liber.getBotuesi().getAdresa()
        );
    }
}
