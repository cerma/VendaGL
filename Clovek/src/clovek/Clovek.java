/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clovek;

/**
 *
 * @author cermak
 */
public class Clovek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int a = 56;
        int b = 20;
        Uzivatel tom = new Uzivatel(34, "Tomik");
        Uzivatel lenka = new Uzivatel(28, "Lenka");
    System.out.printf("a: %s\nb: %s\ntom: %s\nlenka: %s\n\n", a, b, tom, lenka);
      
      a = b;
      tom = lenka;
System.out.printf("a: %s\nb: %s\ntom: %s\nlenka: %s\n\n", a, b, tom, lenka);

lenka.jmeno = "lenicka";
lenka = null;
System.out.printf("tom:  %s\nlenka: %s",tom,lenka);

      
    }
    
}
