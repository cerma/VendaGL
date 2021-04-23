/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naklad;
/**
 *
 * @author cermak
 */
public class Naklad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    NakladniAuto nakladka = new NakladniAuto();
    nakladka.naklad(10000);
    nakladka.naklad(500);
    nakladka.vyklad(300);
    nakladka.vyklad(1000);
        System.out.println("V nákladním autě je naloženo: "+nakladka.hmotnost+" kg");
    
    }
    
}
