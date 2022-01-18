/*
 *  Licence Tomas Cermak
 * 
 */
package kolekce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cermak
 */
public class Kolekce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arraylist bez urciteho typu
     ArrayList list = new ArrayList();
     
     list.add("jednotka");
     String polozka = (String)list.get(0);
        System.out.println(polozka);
        
        //arraylist string typ
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("polstar");
     System.out.println(list2.get(0));
     
     //instance tridy s generickym parametrem
     Trida<Integer> instance = new Trida<>(10);
     
        System.out.println(instance.<Integer>porovnej(10));
        
        
     list.add("jedna");
     list.add("dva");
     list.add("tri");
     list.add("ctyri");
     
     //vypis z printeru mozno tisknout vice datovzch tipu pres jednu metodu
     
     Printer<Integer> p = new Printer<>(20);
     Printer<String> s = new Printer<>("Ahoj");
     p.vypis();
     s.vypis();
        
    }
    
}
