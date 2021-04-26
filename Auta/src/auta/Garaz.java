/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auta;

/**
 *
 * @author cermak
 */
public class Garaz {
        /**
     * Instance auta, které je v garáži zaparkované
     */
    private Auto auto;
    
    /**
     * Vloží auto do garáže
     * @param auto Auto
     */
    public void vloz(Auto auto)
    {
        this.auto = auto;
    }
    
    /**
     * Vrátí textovou reprezentaci garáže
     * @return Textová reprezentace garáže
     */
    @Override
    public String toString()
    {
        return "V garáži je auto: " + auto.vratSpz();
    }
    
}
