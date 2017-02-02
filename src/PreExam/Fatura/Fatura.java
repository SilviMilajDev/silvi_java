package PreExam.Fatura;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura
{
    private String id;
    private String pershkrimi;
    private double vlere;
    private String date_pagese;

    private DateFormat df = new SimpleDateFormat("YYYY/MM/dd");

    public Fatura() {
        id = "";
        pershkrimi = "";
        vlere = 0;
        date_pagese = df.format(new Date());
        System.out.println(date_pagese);
    }

    public Fatura(String id, String pershkrimi, double vlere, String date_pagese) {
        this.id = id;
        this.pershkrimi = pershkrimi;
        this.vlere = vlere;
        this.date_pagese = date_pagese;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public double getVlere() {
        return vlere;
    }

    public void setVlere(double vlere) {
        this.vlere = vlere;
    }

    public String getDatePagese() {
        return date_pagese;
    }

    public void setDatePagese(String date_pagese) {
        this.date_pagese = date_pagese;
    }

    public void aplikoKamate() {
        if ( df.format(new Date()).compareTo(date_pagese) > 0 ) {
            vlere += vlere * 0.03;
        }
    }
}
