/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nahodnevety;

/**
 *
 * @author cermak
 */
public class NahodneVety {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GeneratorVet test = new GeneratorVet();
        
        for (int i = 0; i < 10; i++) {
            
       
        System.out.print(test.generator());
        }
        
    }
    
}
