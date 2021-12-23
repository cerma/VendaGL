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
    public int compareTo(Clovek t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
