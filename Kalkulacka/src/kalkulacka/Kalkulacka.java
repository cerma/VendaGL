/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulacka;
import java.util.Scanner;

/**
 *
 * @author cermak
 */
public class Kalkulacka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Zadej 1. číslo:");
     Scanner sc = new Scanner(System.in);
      double cislo1 = Double.parseDouble(sc.nextLine());
      
           System.out.println("Zadej 2. číslo:");
      double cislo2 = Double.parseDouble(sc.nextLine());
      vypocet obj = new vypocet();
      obj.cislo1 = cislo1;
      obj.cislo2 = cislo2;
      
        System.out.println("Součet: "+obj.scitani());
        System.out.println("Rozdíl: "+obj.odcitani());
        System.out.println("Součin: "+obj.nasobeni());
        System.out.println("Podíl: "+obj.deleni());
     
        
    }
    
}
