package cerma.StremyOptional2;

import java.util.Optional;

public class Osoba implements Comparable<Osoba> {
    private String jmeno;
    private Optional<String> prijmeni;
    private int vek;

    public Osoba(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = Optional.ofNullable(prijmeni);
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Optional<String> getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(Optional<String> prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public int compareTo(Osoba o) {
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
