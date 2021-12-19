/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obchod;

/**
 *
 * @author cermak
 */
public class Adresa {
    private String ulice;
    private int cisloDomu;
    private int cisloBytu;
    private String mesto;
    private String PSC;
    private String zeme;
    
    
    public Adresa(String ulice,int cisloDOmu,int cisloBytu,String mesto,String PSC,String zeme){
     this.ulice = ulice;
     this.cisloDomu = cisloDOmu;
     this.cisloBytu = cisloBytu;
     this.mesto = mesto;
     this.PSC = PSC;
     this.zeme = zeme;

    }
    
    
}
