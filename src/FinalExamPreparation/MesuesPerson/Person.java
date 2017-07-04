package FinalExamPreparation.MesuesPerson;

public class Person {
    public String emri, adresa;

    Person() {
        emri = "";
        adresa = "";
    }

    Person(String e, String a) {
        emri = e; adresa = a;
    }

    public String getEmri() {
        return emri;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setEmri(String e) {
        emri = e;
    }

    public void setAdresa(String a) {
        adresa = a;
    }

    public String toString() {
        return emri + " " + adresa;
    }

    public boolean equals(Person p) {
        return (emri.equals(p.emri) && adresa.equals(p.adresa));
    }

}
