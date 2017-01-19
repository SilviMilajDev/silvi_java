package Seminari6.Liber;

import java.util.ArrayList;

public class Liber
{
    private String
        isbn,
        titulli,
        zhanri;

    private ArrayList<Autor> autoret;

    private Botuesi botuesi;

    private double cmimi;

    public Liber(String isbn, String titulli, String zhanri, ArrayList<Autor> autoret, Botuesi botuesi, double cmimi) {
        this.isbn = isbn;
        this.titulli = titulli;
        this.zhanri = zhanri;
        this.autoret = autoret;
        this.botuesi = botuesi;
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

    public Botuesi getBotuesi() {
        return botuesi;
    }

    public void setBotuesi(Botuesi botuesi) {
        this.botuesi = botuesi;
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

        libri += "Botuesi: "+ botuesi.getEmer() + "\n"
                + "Cmimi: "+ cmimi;

        return libri;
    }
}
