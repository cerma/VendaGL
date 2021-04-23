/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamaradi;

/**
 *
 * @author cermak
 */
public class Kamaradi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Clovek Karel = new Clovek();
       Clovek Josef = new Clovek();
       
       Karel.registr("Karel Novák", 33);
       Josef.registr("Josef Nový", 27);
       
      Karel.vypis();
      Josef.kamos();
      Josef.vypis();
      Karel.kamos();

    }
    
}
