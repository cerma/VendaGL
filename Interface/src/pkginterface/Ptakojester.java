/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public class Ptakojester extends Zvire implements PtakInterface,JesterInterface{

    public Ptakojester(int vaha) {
        super(vaha);
    }

@Override   
public void plazse() {
    System.out.println("Plazím se...");
}



@Override
public void pipni() {
    System.out.println("♫ ♫♫ ♫ ♫ ♫♫");
}

    @Override
    public void presunSe() {
        System.out.println("Plavu");
    }
    
}
