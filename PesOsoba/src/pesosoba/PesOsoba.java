/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesosoba;

/**
 *
 * @author cermak
 */
public class PesOsoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Osoba tom = new Osoba("Tomas Cermak");
     Osoba lenka = new Osoba("Lenka Cermakova");
    Pes azor = new Pes(1, "Azor");
    
    System.out.printf("%s (%s)",azor.jmeno,azor.vek);
    
    tom.pes.zestarni();
    lenka.pes.zestarni();
    
    System.out.printf("%s (%s)",azor.jmeno,azor.vek);
    
    }
    
}
