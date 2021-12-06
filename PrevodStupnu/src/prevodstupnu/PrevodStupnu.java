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
     
      double a = 6.28;
      double b = 90;   
      
      System.out.printf("%.2f radiánů na stupně: %.14f %n",a, Prevodnik.PrevodNaStupne(a));
      System.out.printf("%.0f stupňů na radiány %.16f %n",b, Prevodnik.PrevodNaRadiany(b));
    }
    
}
