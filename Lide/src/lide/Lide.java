/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lide;

/**
 *
 * @author cermak
 */
public class Lide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Clovek karel = new Clovek("Karel Nový", 25);
        
        System.out.print(karel.toString());
        karel.behej(10);
        karel.behej(10);
        karel.spi(1);
        karel.behej(10);
        karel.behej(10);
        
    }
    
}
