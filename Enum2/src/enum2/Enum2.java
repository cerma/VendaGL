/*
 *  Licence Tomas Cermak
 * 
 */
package enum2;

/**
 *
 * @author cermak
 */
public class Enum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Data i = new Data(5);
        System.out.println(i.barva);
        
        System.out.println(i.acces);
        //pridani pprav
        i.acces.add(Prava.Tisk);
        //odebrani prav
        i.acces.remove(Prava.Cteni);
        System.out.println(i.acces);
        //pristup ke konstante
        System.out.println(Data.konstanta);
     
    }
    
}
