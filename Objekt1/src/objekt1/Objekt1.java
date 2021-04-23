/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekt1;

/**
 *
 * @author cermak
 */
public class Objekt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //trida Zdravic
        Zdravic test = new Zdravic();
        test.retezec = "Ahoj ahoj, cau";
       test.pozdrav("pepe");
        test.pozdrav("tomas");
        
        /*Nebo taky takhle:
        * Zdravic test;
        * test = new Zdravic();
        */
        //trida navrat
        navrat x = new navrat();
        x.text = "text atributu text";
        System.out.printf(x.vypis("Jmeno bla"));
        
        
        
        
        
    }
    
}
