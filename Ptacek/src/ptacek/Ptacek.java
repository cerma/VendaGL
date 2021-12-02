/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ptacek;

/**
 *
 * @author cermak
 */
public class Ptacek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Ptak vlastovka = new Ptak();
		System.out.println(vlastovka);
		vlastovka.snez(20);
		System.out.println(vlastovka);
		
		AngryPtak angry = new AngryPtak();
		System.out.println(angry);
		angry.provokuj(5);
		System.out.println(angry);
		angry.snez(100);
		angry.provokuj(5);
		System.out.println(angry);
  
    }
    
}
