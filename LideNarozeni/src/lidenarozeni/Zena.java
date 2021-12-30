/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

import java.time.LocalDate;

/**
 *
 * @author cermak
 */
public class Zena extends Clovek {
    
   public Zena(String jmeno,String prijmeni,int rok, int mesic,int den){
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.narozeni = LocalDate.of(rok, mesic, den);
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
