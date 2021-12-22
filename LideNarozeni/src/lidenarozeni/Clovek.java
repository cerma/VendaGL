/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author cermak
 */
public abstract class Clovek implements Comparable<Clovek>{
    public int stari;
    public String jmeno;
    public String prijmeni;
    public LocalDate narozeni;
    

}
