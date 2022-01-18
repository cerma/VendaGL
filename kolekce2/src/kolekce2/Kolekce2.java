/*
 *  Licence Tomas Cermak
 * 
 */
package kolekce2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cermak
 */
public class Kolekce2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vypis("Ahoj");
        vypis(63);
          List<Integer> seznam = new ArrayList<>();
          seznam.add(15);
          
          printlist(seznam);
        
    }
    
    private static <T> void vypis(T text){
        System.out.println(text + "!!!");
    
    
    }
  
   
    
    private static void printlist(List<?> L){
        System.err.println(L);
    
    }
    
    
}
