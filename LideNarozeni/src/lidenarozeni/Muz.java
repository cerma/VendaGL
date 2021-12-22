/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Date;

/**
 *
 * @author cermak
 */
public class Muz extends Clovek{

    
    
    public Muz(String jmeno,String prijmeni,int rok, int mesic,int den){
        
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.narozeni = LocalDate.of(rok, mesic, den);
    
   
    LocalDate ted = LocalDate.now();
    TemporalAmount vek = Period.between(narozeni, ted);
    stari = (int) vek.get(ChronoUnit.YEARS);
    
    
    }
    
    

    @Override
    public int compareTo(Clovek t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
