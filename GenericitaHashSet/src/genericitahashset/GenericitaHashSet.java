/*
 *  Licence Tomas Cermak
 * 
 */
package genericitahashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cermak
 */
public class GenericitaHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cestujici karel = new Cestujici("Karel", "Novák");
        Cestujici josef = new Cestujici("Josef", "Nový");
        Cestujici tomas = new Cestujici("Tomáš", "Marný");

// vytvoření HashSetu
        Set<Cestujici> cestujici = new HashSet<>();
        
        //pridani cestujicich
        cestujici.add(karel);
        cestujici.add(josef);
        cestujici.add(tomas);
        cestujici.add(tomas);
        cestujici.add(karel);
        
        //hashset zabrani duplicitam
        for(Cestujici  c : cestujici){
            System.out.println(c);
    
    }

    }

}
