package Seminari6.Liber;

public class Autor
{
    private String
            id,
            emer,
            mbiemer,
            email;

    public Autor(String id, String emer, String mbiemer, String email) {
        this.id = id;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.email = email;
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

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Id: "+ id + "\n"
            + "Emer: "+ emer + "\n"
            + "Mbiemer: "+ mbiemer +"\n"
            + "Email: "+ email;
    }
}
