/*
 *  Licence Tomas Cermak
 * 
 */
package vyjimky;

/**
 *
 * @author cermak
 */
public class Data {
    private int i;
    private int j;
    
    public Data (int i,int j){
    this.i = i;
    this.j = j;
  
    }
    
    public void Deleni() throws Exception{
        try {
            System.err.println(i/j);
            
        }
         catch (Exception e) {
    System.out.println("Nepodařilo se uložit nastavení.");
}
        finally {
            System.out.println("Tohle se provede pokazde");
        
        }
    
    }
    
}
