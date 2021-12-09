/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author cermak
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Databaze test = Databaze.getInstance();
       
       
       
    
       System.out.println(test.s);
    }
    
}
