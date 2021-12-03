/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programatori;

/**
 *
 * @author cermak
 */
public class Javista extends Clovek{
    public String IDE;
    
    public Javista(String jmeno, int vek,String IDE) {
        super(jmeno, vek);
        this.IDE = IDE;
            
    }
    public void Programuj(double i){
        
        if ((unava + (i/10))>20)
            System.out.println("Jsem příliš unavený, abych programoval");
        else
    unava = unava + (i/10);
    
    
    }
    
    
  
}
