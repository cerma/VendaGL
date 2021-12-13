/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abazar;

import java.util.ArrayList;


/**
 *
 * @author cermak
 */
public class Autobazar {
    private String adresa;
    private int pokladna;
    //tohle asi nebude dobre
    public ArrayList<Auto> seznam = new ArrayList<>();
    public Autobazar(){
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    /**
     * @return the pokladna
     */
    public int getPokladna() {
        return pokladna;
    }

    /**
     * @param pokladna the pokladna to set
     */
    public void setPokladna(int pokladna) {
        this.pokladna = pokladna;
    }
    //pridej objekt typu auto do seznamu autobazaru
        public void Pridej(String SPZ,String znacka,int cena){
        if (pokladna >= cena) {
            
        
                    Auto auto = new Auto(SPZ,znacka,cena);
       
                     pokladna = pokladna - cena;
                     seznam.add(auto);
                     }
                     else 
                     System.out.println("Neni dostatek penez na nove auto");
    }
    
    
        //pridej nakladni auto
        public void Pridej(String SPZ,String znacka,int cena,int nosnost){
        if (pokladna >= cena) {
            
        
                 NakladniAuto auto = new NakladniAuto(SPZ,znacka,cena,nosnost);
                 pokladna = pokladna - cena;
                     seznam.add(auto);
                 }
                 else 
                System.out.println("Neni dostatek penez na nove auto");
    }       
        //nalezeni auta podle SPZ, pricteni ceny a odstraneni auta z listu
        public void Prodej(String SPZ){
                for (int i = 0;i < seznam.size();i++){
                if (seznam.get(i).SPZ.equals(SPZ)){
                pokladna = pokladna + seznam.get(i).cena;
                seznam.remove(i);
                
                }
                    
                }
                
                
        
        }
        // zjisteni ceny vsech automobilu
        public int CenaAutomobilu(){
        int cena = 0;
        for (int i = 0;i < seznam.size();i++){
        cena = cena + seznam.get(i).cena;
        }
        return cena;
        }
        
       @Override
             public String toString() {
             return String.format("V bazaru je %d automobilů %nNa pokladně je %d Kč%nCelková cena automobilů je %d Kč",seznam.size(),pokladna,CenaAutomobilu() );
             }
        
        
        }
    

