/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tovarna;

/**
 *
 * @author cermak
 */
public class Tovarna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TovarnaNaCukrovi bananove = TovarnaNaCukrovi.Bananove();
        for (int i = 1;i<6;i++){
        System.out.println(bananove);
        }
        TovarnaNaCukrovi jahodove = TovarnaNaCukrovi.Jahodove();
          for (int i = 1;i<9;i++){
        System.out.println(jahodove);
        }
             TovarnaNaCukrovi cokoladove = TovarnaNaCukrovi.Cokoladove();
          for (int i = 1;i<13;i++){
        System.out.println(cokoladove);
        }
    }
    
}
