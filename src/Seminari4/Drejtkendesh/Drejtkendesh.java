package Seminari4.Drejtkendesh;

class Drejtkendesh
{
    private double gjeresi;
    private double gjatesi;

    Drejtkendesh(double permasa) {
        this.gjeresi = permasa;
        this.gjatesi = permasa;
    }

    Drejtkendesh(double gjeresi, double gjatesi) {
        this.gjeresi = gjeresi;
        this.gjatesi = gjatesi;
    }

    public double getGjeresi() {
        return gjeresi;
    }

    public void setGjeresi(double gjeresi) {
        this.gjeresi = gjeresi;
    }

    public double getGjatesi() {
        return gjatesi;
    }

    public void setGjatesi(double gjatesi) {
        this.gjatesi = gjatesi;
    }

    public double gjejPerimetrin() {
        return 2 * ( gjeresi + gjatesi );
    }

    public double gjejSiperfaqe() {
        return gjeresi * gjatesi;
    }

    public String toString() {
        return "Gjeresi: " + this.gjeresi + " Gjatesi: " + this.gjatesi;
    }
}
