package cerma.GenerikaOmezeniCvic;

import java.io.Serializable;

public class MalaOsoba extends Osoba implements Serializable {

    public MalaOsoba(String jmeno, String prijmeni, int vek) {
        super(jmeno, prijmeni, vek);
    }

}
