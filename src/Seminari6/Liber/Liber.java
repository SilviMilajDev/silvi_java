package Seminari6.Liber;

public class Liber
{
    private String
        isbn,
        titulli,
        zhanri;

    private Autor autor;

    private Botuesi botuesi;

    private double cmimi;

    public Liber(String isbn, String titulli, String zhanri, Autor autor, Botuesi botuesi, double cmimi) {
        this.isbn = isbn;
        this.titulli = titulli;
        this.zhanri = zhanri;
        this.autor = autor;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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
        return "ISBN: "+ isbn + "\n"
            + "Titulli: "+ titulli + "\n"
            + "Zhanri: "+ zhanri + "\n"
            + "Autori: "+ autor.getEmer() + " " + autor.getMbiemer() + "\n"
            + "Botuesi: "+ botuesi.getEmer() + "\n"
            + "Cmimi: "+ cmimi;
    }
}
