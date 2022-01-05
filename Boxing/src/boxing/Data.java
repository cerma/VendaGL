/*
 *  Licence Tomas Cermak
 * 
 */
package boxing;

/**
 *
 * @author cermak
 */
public class Data {
    
    // metoda s vice parametry na vstupu 
       public String pozdrav(String text, String... lide) {
        String s = text + " ";
        for (String clovek : lide) {
                s += clovek + ", ";
        }
        return s;
    
}
}