/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statika;

/**
 *
 * @author cermak
 */
public class Statika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //vypis statickeho prvku jine tridy
        System.out.println(Uzivatel.MinimalniDelkaHesla);
        
        System.out.println(Uzivatel.ZvalidujHeslo("hovno"));
        
        // nelze vytvorit instanci tridy s privatnim konstruktorem
       // PrivatniKonstruktor nelze = new PrivatniKonstruktor();
    }
    
}
