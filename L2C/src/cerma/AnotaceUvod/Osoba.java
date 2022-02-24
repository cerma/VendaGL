package cerma.AnotaceUvod;


@TargetAnotation
public class Osoba implements Comparable<Osoba> {
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
    public int compareTo(@TargetAnotation   Osoba o) {
        return o.getJmeno().compareTo(this.getJmeno());
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", vek=" + vek +
                '}';
    }
}
