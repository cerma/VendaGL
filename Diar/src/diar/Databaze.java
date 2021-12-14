/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diar;

import java.time.LocalDateTime;
import java.util.ArrayList;



/**
 *
 * @author cermak
 */
public class Databaze {
    
    private ArrayList<Zaznam> zaznamy = new ArrayList<>();
    public Databaze(){

    }
    //pridani objektu Zaznam do DB 
    public void PridejZaznam(LocalDateTime DatumCas,String text){
    zaznamy.add(new Zaznam(DatumCas,text) );
    
    }
    public ArrayList<Zaznam> najdiZaznamy(LocalDateTime datum, boolean dleCasu) {
    ArrayList<Zaznam> nalezene = new ArrayList<>();
    for (Zaznam z : zaznamy) {
        if ((dleCasu && z.getDatumCas().equals(datum)) ||
            (!dleCasu && z.getDatumCas().toLocalDate().equals(datum.toLocalDate()))) {
            nalezene.add(z);
        }
    }
    return nalezene;
}
    
    
}
