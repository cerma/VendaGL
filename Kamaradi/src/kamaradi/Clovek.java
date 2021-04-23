/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamaradi;

/**
 *
 * @author cermak
 */
public class Clovek {
    public String name;
    public int v;
    
    public void registr(String jmeno,int vek){
        name = jmeno;
        v = vek;
    }
    public void kamos(){
    System.out.println(name);
    
    }
    public void vypis(){
    System.out.print("Ahoj, já jsem "+name+", je mi "+v+"let a můj kamarád je ");
    
    
    }
}
