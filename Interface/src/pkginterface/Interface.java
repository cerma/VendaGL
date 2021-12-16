/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

import java.util.ArrayList;

/**
 *
 * @author cermak
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PtakInterface ptak = new Ptak(1);
        PtakInterface ptakojester = new Ptakojester(1);
        //pretypovani na typ
       ((Ptakojester)ptakojester).plazse();
       
       
        ArrayList<Zvire> zvirata= new ArrayList<>();
        zvirata.add(new Ptak(1));
        zvirata.add(new Ptakojester(2));
         zvirata.add(new Ptakojester(4));
        zvirata.add(new Delfin(3));
        zvirata.add(new Delfin(5));
       //instance tridy zvire nejde vytvorit protoze je trida abstraktni
       //zvirata.add(new Zvire(10));
        //zjisteni jestli je to instance delfina
        for (Zvire test : zvirata){
            System.out.println(test);
            if (test instanceof Delfin){
                ((Delfin) test).Vyskoc();
        }
        }
       
        
     
        
    }
    
}
