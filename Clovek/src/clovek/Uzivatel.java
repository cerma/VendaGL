/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clovek;

/**
 *
 * @author cermak
 */
public class Uzivatel {
    public int vek;
    public String jmeno;
    
    public Uzivatel(int vek,String jmeno){
    this.jmeno = jmeno;
    this.vek = vek;
    
    }
    @Override
    public String toString(){
    return jmeno;
    }
    
    
}
