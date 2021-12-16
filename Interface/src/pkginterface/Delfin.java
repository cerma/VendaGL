/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public class Delfin extends Zvire{
    
    public Delfin(int vaha) {
        super(vaha);
    }
    public void Vyskoc(){
        System.out.println("Vyskocil jsem nad hladinu");
    
    
    }

    @Override
    public void presunSe() {
        System.out.println("Plavu");
    }
}
