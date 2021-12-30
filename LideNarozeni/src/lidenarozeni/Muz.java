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
    public int compareTo(Clovek c) {
  int vysledek = c.jmeno.compareTo(jmeno); 
     
        if (vysledek == 0){
            if (narozeni.getYear() > c.narozeni.getYear())
             return 1;
            else if (narozeni.getYear() < c.narozeni.getYear())
                return -1;
            else return 0;
        }
        else if(vysledek>0)
            return -1;
        else 
            return 1;
    }

 
    
}