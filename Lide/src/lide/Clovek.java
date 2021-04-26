/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lide;

/**
 *
 * @author cermak
 */
public class Clovek {
    
    private String jmeno;
    private int vek;
    private int unava = 0;
    
    
    public Clovek(String jmeno,int vek){
         this.jmeno = jmeno;
         this.vek = vek;
    
    
    }
    
        public void behej(int beh){
            
            if (unava+beh < 21){
             unava = unava + beh;
            }
            else System.out.println("Jsem příliš unavený");
        }
        
        public void spi(int spanek){
             int spanekbody = spanek * 10;
        
             if (unava-spanekbody >= 0 )
        {
             unava = unava - spanekbody;
        
        }
        
        }
             @Override
             public String toString() {
             return String.format("%s (%s) \n",jmeno,vek );
        
        
             }
    
}
