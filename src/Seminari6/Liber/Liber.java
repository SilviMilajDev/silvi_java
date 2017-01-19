package Seminari6.Liber;

import java.util.ArrayList;

public class Liber
{
    private String
        isbn,
        titulli,
        zhanri;

    private ArrayList<Autor> autoret;

    private ArrayList<Botuesi> botuesit;

    private double cmimi;

    public Liber(String isbn, String titulli, String zhanri, ArrayList<Autor> autoret, ArrayList<Botuesi> botuesit, double cmimi) {
        this.isbn = isbn;
        this.titulli = titulli;
        this.zhanri = zhanri;
        this.autoret = autoret;
        this.botuesit = botuesit;
        this.cmimi = cmimi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public String getZhanri() {
        return zhanri;
    }

    public void setZhanri(String zhanri) {
        this.zhanri = zhanri;
    }

    public  ArrayList<Autor> getAutoret() {
        return autoret;
    }

    public void setAutoret( ArrayList<Autor> autoret) {
        this.autoret = autoret;
    }

    public ArrayList<Botuesi> getBotuesit() {
        return botuesit;
    }

    public void setBotuesit(ArrayList<Botuesi> botuesit) {
        this.botuesit = botuesit;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public String toString() {
        String libri = "ISBN: "+ isbn + "\n"
            + "Titulli: "+ titulli + "\n"
            + "Zhanri: "+ zhanri + "\n"
            + "Autoret:\n";

        for (int i = 0; i < this.autoret.size(); i++) {
            libri += " - " + this.autoret.get(i).getEmer() + " " + this.autoret.get(i).getMbiemer() + "\n";
        }

        libri += "Botuesit:\n";

        for (int i = 0; i < this.botuesit.size(); i++) {
            libri += " - " + this.botuesit.get(i).getEmer() + "\n";
        }

        libri += "Cmimi: "+ cmimi;

        return libri;
    }
}
