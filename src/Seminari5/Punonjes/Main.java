package Seminari5.Punonjes;

/**
 * Ndertoni nje klase me emer Punonjes e cila ka si instanca: id, emer, mbiemer
 * Ndertoni konstruktoret me parameter dhe pa parameter, set get per secilen instance
 * Ndertoni metoden ndihmese llogarit pagen neto + toString
 * Testoni klasen me dy objekte punonjes
 * Modifikoni metoden getId e cila ben te mundur gjenerim ne menyre automatike te id-se
 * se ketij punonjesi. ID: 2 shkronja (Inicialet) + Random(4) + Data(YYYY,MM,DD)
 */

public class Main
{
    public static void main(String[] args)
    {
        Punonjes punonjes1 = new Punonjes("John", "Smith");
        punonjes1.setPagaBruto(2300);
        System.out.println(punonjes1.getId());
        System.out.println(punonjes1.getMbiemri());
        System.out.println(punonjes1);

        Punonjes punonjes2 = new Punonjes("Jack", "Doe", 800);
        punonjes2.setEmri("James");
        System.out.println(punonjes2);
    }
}
