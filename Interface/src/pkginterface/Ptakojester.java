/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public class Ptakojester implements PtakInterface,JesterInterface{

  @Override   
public void plazse() {
    System.out.println("Plazím se...");
}

@Override
public void dychej() {
    System.out.println("Dýchám...");
}

@Override
public void pipni() {
    System.out.println("♫ ♫♫ ♫ ♫ ♫♫");
}
    
}
