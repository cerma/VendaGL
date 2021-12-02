/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strom;

/**
 *
 * @author cermak
 */
public class Strom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obdelnik kmen = new Obdelnik("Hneda",3,26);
        Trojuhelnik koruna = new Trojuhelnik("Hneda",15,15,25);
        
        double vypocet = (4*koruna.Obsah()) + kmen.Obsah();
        
        String formated = String.format("Obsah stromu je %.12f cm2", vypocet);
        System.out.prin­tln(formated.re­place(",", "."));
    }
    
}
