/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tovarna;

/**
 *
 * @author cermak
 */
public class TovarnaNaCukrovi {
    
    private String barva;
    private String tvar;
    private int vaha;
    
        private TovarnaNaCukrovi(String barva,String tvar,int vaha){
        this.barva  = barva;
        this.tvar = tvar;
        this.vaha = vaha;
        }
        
        public static TovarnaNaCukrovi Bananove(){
        
        return new TovarnaNaCukrovi("žlutá", "kulatý", 20);
        }
         public static TovarnaNaCukrovi Jahodove(){
        
        return new TovarnaNaCukrovi("červená", "kulatý", 15);
        }
         
             public static TovarnaNaCukrovi Cokoladove(){
        
        return new TovarnaNaCukrovi("hnědá", "hranatý", 25);
        }
        
            @Override
             public String toString() {
             return String.format("Cukroví barvy %s, tvaru %s a váhy %dg",barva,tvar,vaha );
             }
}
