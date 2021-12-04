/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strom;

/**
 *
 * @author cermak
 */
public class Trojuhelnik extends  Tvar{
    
    public double a;
    public double b;
    public double c;
    
    public Trojuhelnik(String barva,double a,double b,double c) {
        super(barva);
        this.a = a;
        this.b = b;
        this.c = c;
        
            
    }
    public double Obsah(){
    double s = (a + b + c)/2;
    
    double obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    
    return obsah;
        
    }
    
    
    
}
