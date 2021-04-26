/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author cermak
 */
public class TahovyBoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Kostka kosticka = new Kostka(10);
        Kostka kosticka2 = new Kostka();
        

       
        
        //hod s 6ti stennou
         System.out.println(kosticka2.toString());
        for (int i = 0; i < 10; i++) {
            System.out.print(kosticka2.hod()+" ");
        }
        System.out.println();
            //hod s 10ti stennou
         System.out.println(kosticka.toString());
        for (int i = 0; i < 10; i++) {
            System.out.print(kosticka.hod()+" ");
        } 
    }
    
}
