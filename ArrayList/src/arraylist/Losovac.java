/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author cermak
 */
public class Losovac {
    private ArrayList<Integer> cisla;
    private Random nahodne;
    
    public Losovac() {
    nahodne = new Random();
    cisla = new ArrayList<Integer>();
    
    
    }
    
    public int Losuj(){
     int cislo = nahodne.nextInt(100) + 1;
     //add prida cislo do listu
     cisla.add(cislo);
     return cislo;
     
    }
    
    public String Vypis()
    {
    String s="";
    //serazeni cisel v listu
        Collections.sort(cisla);
        for (int i :cisla){
        s += i + " ";
        
       
        }
        return s;
    
    
    }
    
    
}
