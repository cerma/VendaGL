/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prevodstupnu;

/**
 *
 * @author cermak
 */
public class PrevodStupnu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Prevodnik.PrevodNaRadiany(90));
      double a = 6.28;
      
      
      
      System.out.printf("%.2f radiánů na stupně: %f %n",a, Prevodnik.PrevodNaStupne(6.28));
    }
    
}
