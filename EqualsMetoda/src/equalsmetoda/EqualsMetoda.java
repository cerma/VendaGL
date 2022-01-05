/*
 *  Licence Tomas Cermak
 * 
 */
package equalsmetoda;

import java.time.LocalDate;

/**
 *
 * @author cermak
 */
public class EqualsMetoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Data tomas = new Data("Tomas", "Cermak", 52);
        Data tom = new Data("Tomas", "Cermak", 20);

        if (tom.equals(tomas)) {
            System.out.println("objekty jsou stejne");

        } else {
            System.out.println("Objekty nejsou stejne");
            
            
        }
        //klonovani objektu
       Data z2 = (Data)tomas.clone(); 
       
         if (tomas.equals(z2)) {
            System.out.println("objekty jsou stejne");

        } else {
            System.out.println("Objekty nejsou stejne");
            
            
        }
    }
    
    

}
