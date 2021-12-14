/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public class Ptak implements PtakInterface{
    @Override    
    public void pipni() {
        System.out.println("♫ ♫ ♫");
    }
    @Override
    public void dychej() {
        System.out.println("Dýchám...");
    }
    
    public void klovni() {
        System.out.println("Klov, klov!");
    }
    }

