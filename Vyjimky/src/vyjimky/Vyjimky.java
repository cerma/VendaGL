/*
 *  Licence Tomas Cermak
 * 
 */
package vyjimky;

import java.util.Scanner;

/**
 *
 * @author cermak
 */
public class Vyjimky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "Windows-1250");
   System.out.println("Zadejte dělitele a dělence k výpočtu podílu:");
int a = Integer.parseInt(sc.nextLine());
int b = Integer.parseInt(sc.nextLine());

Data prvek = new Data(a,b);



    }
    
}
