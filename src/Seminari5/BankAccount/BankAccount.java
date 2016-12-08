package Seminari5.BankAccount;

public class BankAccount
{
    private String id, emer;
    private double balanca;

    public BankAccount() {
        this.id = "DFs3Jajk2da423as";
        this.emer = "Test";
        this.balanca = 0;
    }

    public BankAccount(String id, String emer, double balanca) {
        this.id = id;
        this.emer = emer;
        this.balanca = balanca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public double getBalanca() {
        return balanca;
    }

    public void setBalanca(double balanca) {
        this.balanca = balanca;
    }

    public void shto(double vlera) {
        if (vlera < 0) {
            System.out.println("Vlera nuk mund te jete negative");
            return;
        }
        this.balanca += vlera;
    }

    public void terhiq(double vlera) {
        if (vlera > this.balanca) {
            System.out.println("Vlera e kerkuar nuk mund te terhiqet");
            return;
        }
        this.balanca -= vlera;
    }

    public String toString() {
        return "Emri: " + this.emer + "\n"
            + "Balanca: " + this.balanca;
    }
}
