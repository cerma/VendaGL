/** Třída reprezentuje zdravič, který slouží ke zdravení uživatelů */
package objekt1;

/**
 *
 * @author cermak
 */
public class Zdravic {
    public String retezec;
  
      /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param  jmeno  Jméno uživatele
     * @return      Text s pozdravem
     */
 public void pozdrav(String jmeno){
 System.out.printf(" %s %s \n",retezec , jmeno);
 }   
    
    
}
