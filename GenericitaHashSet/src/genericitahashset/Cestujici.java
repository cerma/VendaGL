/*
 *  Licence Tomas Cermak
 * 
 */
package genericitahashset;

/**
 *
 * @author cermak
 */
public class Cestujici {
    private final String jmeno;
    private final String prijmeni;

    public Cestujici(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " "+ prijmeni;
    }
    
    
    
}
