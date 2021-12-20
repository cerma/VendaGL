/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obchod;

/**
 *
 * @author cermak
 */
public class Obchod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(1, "Tomáš", "Marný");
        Adresa adresa = new Adresa("Ve Svahu", 10, 2, "Praha", "10000","Česká republika");
        Produkt produkt = new Produkt("Body pro ITnetwork.cz", 1, 239);

        OrderInterface objednavka = new Objednavka(zakaznik,adresa,produkt);
        Gateway brana = new Gateway();
        brana.processOrder(objednavka);

    }
    
}
