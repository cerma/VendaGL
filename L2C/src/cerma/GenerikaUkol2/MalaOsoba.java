package cerma.GenerikaUkol2;

public class MalaOsoba extends Osoba{

    public MalaOsoba(String jmeno, String prijmeni, int vek) {
        super(jmeno, prijmeni, vek);
    }

    public void mluv(){
        System.out.println("mluvim");

    }
}
