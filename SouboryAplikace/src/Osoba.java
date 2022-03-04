import java.time.LocalDate;
import java.util.Locale;

public class Osoba {
    private final String jmeno;
    private final int vek;
    private final LocalDate registrovan;

    public Osoba(String jmeno, int vek, LocalDate registrovan) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.registrovan = registrovan;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    public LocalDate getRegistrovan() {
        return registrovan;
    }

    @Override
    public String toString() {
        return jmeno;
    }
}
