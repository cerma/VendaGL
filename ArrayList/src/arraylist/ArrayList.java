/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author cermak
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Losovac kostka = new Losovac();
       for (int i=1;i<20;i++){
       kostka.Losuj();}
        System.out.println(kostka.Vypis());
    }
    
}
