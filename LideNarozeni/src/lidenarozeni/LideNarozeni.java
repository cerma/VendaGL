/*
 *  Licence Tomas Cermak
 * 
 */
package lidenarozeni;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cermak
 */
public class LideNarozeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Clovek> seznam= new ArrayList<>();
        Clovek karel = new Muz("Karel","Novák",1988,2,5);
        seznam.add(karel);
        Clovek josef = new Muz("Josef","Nový",1978,3,19);
        seznam.add(josef);
         Clovek jan = new Muz("Jan","Marek",1968,4,28);
        seznam.add(jan);
      Clovek karel2 = new Muz("Karel","Novák",1958,6,25);
        seznam.add(karel2);
         Clovek marie = new Zena("Marie","Nová",1988,8,15);
        seznam.add(marie);
         Clovek vera = new Zena("Věra","Nováková",1978,2,10);
        seznam.add(vera);
         Clovek simona = new Zena("Simona","Mladá",1968,1,8);
        seznam.add(simona);
         Clovek michaela = new Zena("Michaela","Marná",1958,6,12);
        seznam.add(michaela);
        Collections.sort(seznam);
        
        
        for (Clovek a : seznam){
            System.out.println(a);
        
        
        }
        System.out.println("Karel Novák 98 a Marie Nová 88 spolu mají dítě Eva Nová 17");
        
        
      
        
       
        
       
    }
    
}
