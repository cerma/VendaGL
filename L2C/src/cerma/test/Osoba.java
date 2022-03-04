package cerma.test;


import cerma.AnotaceUvod.TargetAnotation;

@TargetAnotation
public class Osoba implements IOsoba  {
    private @TargetAnotation String jmeno;
    private String prijmeni;
    private int vek;
    @TargetAnotation
    public Osoba(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }
    @TargetAnotation
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }



    @Override
    public String toString() {
        return "Osoba{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", vek=" + vek +
                '}';
    }

    @Override
    public String prsi() {
        return "prsi";
    }
}
