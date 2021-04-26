/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auta;

/**
 *
 * @author cermak
 */
public class Auta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Garaz garaz = new Garaz();
        Auto skoda = new Auto("123ABC", "modrá");
        skoda.zaparkuj(garaz);
        System.out.println(garaz);
            
        
        }
    
}
