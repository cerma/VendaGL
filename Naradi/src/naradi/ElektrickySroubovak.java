/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naradi;

/**
 *
 * @author cermak
 */
public class ElektrickySroubovak extends Sroubovak{
    public int KapacitaBaterie;

    public ElektrickySroubovak(String nazev, int vaha,int KapacitaBaterie) {
        super(nazev, vaha);
        this.KapacitaBaterie = KapacitaBaterie;
    }
    
  @Override
    public String pracuj() {
       return "Šroubuji elektricky";
    }
    
    }
    
    

