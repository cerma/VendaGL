/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;
import java.util.Random;
/**
 *
 * @author cermak
 */
public class Kostka {
   private Random rand;
   private int pocetSten;
   
     public Kostka(int pocet) {
     this.pocetSten = pocet;
     rand = new Random();
    
}
     public Kostka() {
     pocetSten = 6;
     rand = new Random();
}
             public int VratPocetSten(){
             return pocetSten;
  
  }
             public int hod(){
             return rand.nextInt(pocetSten) + 1;
             }
             
             @Override
             public String toString() {
             return String.format("Kostka s %s stěnami", pocetSten);
    }

}
