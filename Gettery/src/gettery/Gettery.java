/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gettery;

/**
 *
 * @author cermak
 */
public class Gettery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student Pavel = new Student("pavel",true,19);
        
        
        System.out.println(Pavel);
        System.out.println(Pavel.getJmeno());
        
        Pavel.setVek(15);
        System.out.println(Pavel);
        
       // Pavel.jmeno = "tohle nejde";
    }
    
}
