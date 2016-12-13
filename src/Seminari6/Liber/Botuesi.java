package Seminari6.Liber;

public class Botuesi
{
    private String
            id,
            emer,
            adresa;

    public Botuesi(String id, String emer, String adresa) {
        this.id = id;
        this.emer = emer;
        this.adresa = adresa;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String toString() {
        return "Id: "+ id + "\n"
            + "Emer: "+ emer + "\n"
            + "Adresa: "+ adresa;
    }
}
