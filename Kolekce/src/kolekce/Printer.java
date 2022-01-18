/*
 *  Licence Tomas Cermak
 * 
 */
package kolekce;

/**
 *
 * @author cermak
 */
public class Printer <T> {
    public T tisk;

    public Printer(T tisk) {
        this.tisk = tisk;
    }
    
    public void vypis(){
        System.out.println(tisk);
    
    
    }
    
}
