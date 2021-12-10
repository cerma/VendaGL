/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistslova;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author cermak
 */
public class ArrayListSlova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String slovo= "";
        ArrayList<String> seznam = new ArrayList<String>();
        //vytvoreni objektu scanneru
        Scanner sc = new Scanner(System.in);
        String s = "";
         
            
        while (!slovo.equals("konec")  ) { 
              System.out.print("Zadej slovo: ");
              slovo = sc.nextLine();
               
              //prevod na male pismena
              slovo = slovo.toLowerCase();
              
              //pridani slova do listu, vylouceni duplicit
              if (!(seznam.contains(slovo)))
              {
                  if (!seznam.contains("konec")){
              seznam.add(slovo);}
              }
             
              
        }
        System.out.print("Zadal jsi tato slova: ");
      //  for (String i : seznam){
        //    if (!i.equals("konec")) {
                
 
           
           System.out.printf("Zadal jsi tato slova: %s", String.join(", ", seznam));
        
        
     
        
        
        
        }
        
      
        
        
    }
    
  
