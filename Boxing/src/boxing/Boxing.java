/*
 *  Licence Tomas Cermak
 * 
 */
package boxing;

/**
 *
 * @author cermak
 */
public class Boxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // int na referencni typ
        int a = 10;
Object zabalenyInt = a;

        System.out.println(zabalenyInt);
        //Integer je referencni datovy typ misto int,muze nabyvat hodnoty NULL
        Integer i;
        i = null;
        i = 100;
        System.out.println(i);
System.out.println(i.intValue());


Data test = new Data();
        System.out.println(test.pozdrav("Ahoj", "tady","muze","byt","vice parametru"));


        
    }
    
}
