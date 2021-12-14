/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abazar;

/**
 *
 * @author cermak
 */
public class Abazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Autobazar cermak = new Autobazar();
         // prirazeni adresy a vychozi castky v pokladne
         cermak.setAdresa("Hustenovice 156");
         cermak.setPokladna(5000000);
         
         cermak.Pridej("123ABC", "Škoda 120", 10000);
         cermak.Pridej("456DEF", "Škoda Faabia", 100000);
         cermak.Pridej("789GHI", "Ferrari FF", 3000000);
         cermak.Pridej("534NGS", "Tatra 811", 50000, 20);
         cermak.Pridej("489GSR", "Renault Midliner", 100000, 30);
         
          
         
         

          for (int i = 0;i < cermak.seznam.size();i++){
         System.out.println(cermak.seznam.get(i).SPZ);
          }
         
        
         System.out.println(cermak);
         
         
         
    }
    
}
