/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naradi;

import java.util.ArrayList;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author cermak
 */
public class Bedna {
    public int Nosnost;
    public int VahaNaradi;
    private ArrayList<Nastroj> naradi = new ArrayList<>();
    
  //  Konstruktor zadat nosnost bedny
    
    public Bedna (int Nosnost){
    this.Nosnost = Nosnost;
    
    }
   // vlozi nastroj do Listu 
  public void Vloz(Nastroj j){
        
    if ((VahaNaradi+j.vaha) < Nosnost  )
    {
    VahaNaradi += j.vaha;
    naradi.add(j);

    }   
  }
  
  // vynda nastroj z Listu
  public void Vyndej(String jmeno){
   for (Nastroj z : naradi){
       if(z.nazev == jmeno) {
       naradi.remove(z);
       }
 
   }

  }
//vypise obsah bedny
	public void Vypis() {
            if (naradi.isEmpty()){
                System.out.println("Bedna je prázdná.");}
            else{
            System.out.print("V bedně je: ");
            
	for(Nastroj z :naradi){
           if (!z.equals(naradi.get(naradi.size() - 1))){
               System.out.print(z.nazev + ", ");
           
            
           }
           else
               System.out.print(z.nazev);
             
        
        }	
            }   
            
		
 
 }
 

  
}
