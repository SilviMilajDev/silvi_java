package FinalExamPreparation.MesuesPerson;

import java.util.ArrayList;

public class Mesues extends Person {
    public static int counter = 1;

    public ArrayList<String> kurset = new ArrayList<>();
    public int kodi;

    Mesues() {
        super();
        kodi = counter++;
    }

    Mesues(String em, String mb) {
        super(em, mb);
        kodi = counter++;
    }

    public void shtoKurs(String k) {
        kurset.add(k);
    }

    public void hiqKurs(String k) {
        for (int i = 0; i < kurset.size(); i++) {
            if (kurset.get(i).equals(k))
                kurset.remove(i);
        }
    }

    public String toString() {
        String kurset_string = "";
        for (String kurs : kurset) {
            kurset_string += kurs + " ";
        }
        return kodi + " " +super.toString() + " " + kurset_string;
    }
}
