/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public class Ptak extends Zvire implements PtakInterface{

    public Ptak(int vaha) {
        super(vaha);
    }
    @Override    
    public void pipni() {
        System.out.println("♫ ♫ ♫");
    }

    
    
    public void klovni() {
        System.out.println("Klov, klov!");
    }
        @Override
    public String toString(){
            
       return String.format("Tohle je Ptak, vazi %d kilogramu ", vaha);
            }

    @Override
    public void presunSe() {
        System.out.println("Litam");
    }
    }

