/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naradi;

/**
 *
 * @author cermak
 */
public class Naradi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bedna bedna = new Bedna(10000);
        bedna.Vypis();
       Nastroj kladivo = new Kladivo("Kladívko",1200,false); 
       bedna.Vloz(kladivo);
        Nastroj kladivo2 = new Kladivo("Velké kladivo",3000,true); 
       bedna.Vloz(kladivo2);
        Nastroj kladivo3 = new Kladivo("Bourací kladivo",4000,true); 
       bedna.Vloz(kladivo3);
       Nastroj sroubovak = new Sroubovak("Šroubovák Philips",800); 
       bedna.Vloz(sroubovak);
       Nastroj pila = new Pila("Zrezivělá pila",2500); 
       bedna.Vloz(pila);
       Nastroj EleSroubovak = new ElektrickySroubovak("Elektrický šroubovák Bosh",1800,8000); 
       bedna.Vloz(EleSroubovak);
        bedna.Vypis();
        System.out.println();
        System.out.println(kladivo.pracuj());
        System.out.println(kladivo2.pracuj());
        System.out.println(kladivo3.pracuj());
        System.out.println(sroubovak.pracuj());
       // System.out.println(pila.pracuj());
        //System.out.println(EleSroubovak.pracuj());
        System.out.println("Váha obouručních kladiv je 7000 gramů");
        
        
    }
    
}
