/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abazar;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

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
        new Auto(SPZ,znacka,cena);
    //seznam.add(auto);
    
    }
    
}
