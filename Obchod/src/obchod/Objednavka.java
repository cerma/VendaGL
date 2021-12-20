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
public class Objednavka implements OrderInterface{
    
    public Zakaznik z;
    public Adresa a;
    public Produkt p;
    
    public Objednavka(Zakaznik z,Adresa a,Produkt p){
       this.z = z;
       this.a= a;
       this.p = p;
       
    
    }

    @Override
    public int getNumber() {
        return z.cisloZakaznika;
    }

     @Override
    public String getFirstName() {
     return z.jmeno;
    }

  @Override
    public String getLastName() {
        return z.prijmeni;
    }

     @Override
    public String getStreet() {
      return a.ulice;
    }

 @Override
    public int getHouseNumber() {
      return a.cisloDomu;
    }

     @Override
    public int getRegistryNumber() {
        return a.cisloBytu;
    }

   @Override
    public String getCity() {
        return a.mesto;
    }

    @Override
    public String getZipCode() {
        return a.PSC;
    }

    @Override
    public String getCountry() {
       return a.zeme;
    }
    @Override
    public ArrayList<String> getProducts() {
        return p.produkty;
    }

    @Override
    public ArrayList<Integer> getProductQuantities() {
        return p.pocet;
    }
 @Override
    public ArrayList<Double> getProductPrices() {
       return p.cena;
    }

   
}
