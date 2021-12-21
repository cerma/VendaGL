/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naradi;

/**
 *
 * @author cermak
 */
public class Sroubovak extends Nastroj{
    
    
    public Sroubovak(String nazev,int vaha){
    
      this.nazev = nazev;
    this.vaha = vaha;
    }
    

    @Override
    public String pracuj() {
       return "Šroubuji";
    }
  
    
    
    
    
}
