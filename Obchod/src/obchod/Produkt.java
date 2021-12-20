/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obchod;
import java.util.ArrayList;
/**
 *
 * @author cermak
 */
public class Produkt {
   public ArrayList<String> produkty= new ArrayList<>();
   public ArrayList<Integer> pocet= new ArrayList<>();
    public ArrayList<Double> cena= new ArrayList<>();
    
    
    public Produkt(String produkt,int pocet,double cena){
    this.produkty.add(produkt);
    this.pocet.add(pocet);
    this.cena.add(cena);
    
    }
    
    
}
