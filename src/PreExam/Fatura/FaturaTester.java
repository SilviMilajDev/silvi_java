package PreExam.Fatura;

import java.util.*;

public class FaturaTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ArrayList<Fatura> faturat = new ArrayList<>();
        Fatura fatura;

        for (int i = 0; i < 10; i++) {
            System.out.print("Vendos id: ");
            String id = in.nextLine();

            System.out.print("Vendos pershkrimin: ");
            String pershkrimi = in.nextLine();

            System.out.print("Vendos vleren: ");
            double vlera = in.nextDouble();
            String consume = in.nextLine();

            System.out.print("Vendos daten: ");
            String data = in.nextLine();

            fatura = new Fatura(id, pershkrimi, vlera, data);
            faturat.add(fatura);
        }

        for (int i = 0; i < faturat.size(); i++) {
            Fatura f = faturat.get(i);
            double vlera_para = f.getVlere();
            f.aplikoKamate();
            if (vlera_para != f.getVlere()) {
                System.out.println(
                    "Id: " + f.getId() + "\n" +
                    "Pershkrimi: " + f.getPershkrimi() + "\n" +
                    "Vlere: " + f.getVlere() + "\n" +
                    "DatePagese: " + f.getDatePagese() + "\n"
                );
            }
        }
    }
}
