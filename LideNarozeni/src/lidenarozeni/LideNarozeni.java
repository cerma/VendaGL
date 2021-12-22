/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

/**
 *
 * @author cermak
 */
public class LideNarozeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clovek tomas = new Muz("Tomas","Cermak",1986,6,10);
        
        
        System.out.println(tomas.narozeni);
        System.out.println(tomas.stari);
        
       
    }
    
}
