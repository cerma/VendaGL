/*
 *  Licence Tomas Cermak
 * 
 */
package kolekce;

/**
 *
 * @author cermak
 */
public class Trida<T> {
    private T promena;

    public Trida(T promena) {
        this.promena = promena;
    }
    
    public <T2> boolean porovnej(T2 a){
    return  promena.equals(a);
    
    
    }
}
