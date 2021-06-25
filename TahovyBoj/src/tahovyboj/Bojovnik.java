/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahovyboj;

/**
 *
 * @author cermak
 */
public class Bojovnik {
    
        /** Jméno bojovníka */
    private String jmeno;
    /** Život v HP */
    private int zivot;
    /** Maximální zdraví */
    private int maxZivot;
    /** Útok v HP */
    private int utok;
    /** Obrana v HP */
    private int obrana;
    /** Instance hrací kostky */
    private Kostka kostka;
        
    public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kostka kostka){
    this.jmeno = jmeno;
    this.zivot = zivot;
    this.maxZivot = zivot;
    this.utok = utok;
    this.obrana = obrana;
    this.kostka = kostka;   
    
    
    }
    
}
