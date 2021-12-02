/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strom;

/**
 *
 * @author cermak
 */
public class Obdelnik extends Tvar{
    public int sirka;
    public int vyska;
    
    public Obdelnik(String barva,int vyska,int sirka) {
        super(barva);
        this.vyska = vyska;
        this.sirka = sirka;
        
        
    }
    
    public double Obsah(){
    double obsah = vyska*sirka;
    
    return obsah;
    
    }
    
    
}
