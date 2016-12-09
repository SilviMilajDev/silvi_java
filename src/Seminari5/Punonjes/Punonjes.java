package Seminari5.Punonjes;

import java.util.Random;

public class Punonjes
{
    private String id, emri, mbiemri;
    private double paga_bruto;

    public Punonjes(String emri, String mbiemri) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = this.setId();
    }

    public Punonjes(String emri, String mbiemri, double paga_bruto) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.paga_bruto = paga_bruto;
        this.id = this.setId();
    }

    private String setId() {
        return this.emri.charAt(0)
                + "" + this.mbiemri.charAt(0)
                + "" + this.randomNumber()
                + "" + System.currentTimeMillis();
    }

    private int randomNumber() {
        Random rand = new Random();
        int max_number = 999,
            min_number = 100;

        return rand.nextInt(max_number - min_number + 1) + min_number;
    }

    public double llogaritPagenNeto() {
        if (paga_bruto >= 1300) {
            return paga_bruto - 0.23 * paga_bruto;
        }

        if (paga_bruto < 270) {
            return paga_bruto;
        }

        return paga_bruto - 0.1 * paga_bruto;
    }

    public String getId() {
        return this.id;
    }

    public String getEmri() {
        return this.emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return this.mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public double getPagaBruto() {
        return paga_bruto;
    }

    public void setPagaBruto(double paga_bruto) {
        if (paga_bruto < 0){
            System.out.println("Paga nuk mund te jete negative");
            this.paga_bruto = 0;
            return;
        }
        this.paga_bruto = paga_bruto;
    }

    public String toString() {
        return "Emer Mbiemer: " + this.emri + " " + this.mbiemri + "\n"
            + "Paga Neto: " + this.llogaritPagenNeto();
    }
}
