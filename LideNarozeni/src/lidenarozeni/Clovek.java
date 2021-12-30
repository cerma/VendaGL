/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;

/**
 *
 * @author cermak
 */
public abstract class Clovek implements Comparable<Clovek>{
    public int stari;
    public String jmeno;
    public String prijmeni;
    public LocalDate narozeni;
    
    public int compareTo(Clovek c){  
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
    
    
    
    
     @Override
    public String toString(){
        
      
    return String.format("%s %s %d", jmeno, prijmeni,narozeni.getYear()% 100);
    }
    
    
    
    
    
    
  
    
    
    }


