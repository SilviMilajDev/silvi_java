package Seminari4.Student;

class Student
{
    private String emer;
    private String mbiemer;
    private String dega;
    private String matrikulimi;

    Student(String emer) {
        this.emer = emer;
    }

    public String getEmer() {
        return emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public String getDega() {
        return dega;
    }

    public void setDega(String dega) {
        this.dega = dega;
    }

    public String getMatrikulimi() {
        return matrikulimi;
    }

    public void setMatrikulimi(String matrikulimi) {
        this.matrikulimi = matrikulimi;
    }

    public String toString() {
        return "Emri: " + this.emer + " Mbiemri: " + this.mbiemer;
    }
}
