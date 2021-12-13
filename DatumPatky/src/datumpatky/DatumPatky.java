/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datumpatky;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cermak
 */
public class DatumPatky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Pro zadaný interval datumů vypíše všechny pátky 13.:");
        System.out.println("Zadejte 1. datum:");
        LocalDate datum1 = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("d.M.y"));

        System.out.println("Zadejte 2. datum:");
        LocalDate datum3 = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("d.M.y"));
         String s ="";
            while(!datum1.equals(datum3))
        {
            if( (datum1.getDayOfWeek() == DayOfWeek.FRIDAY) && datum1.getDayOfMonth()==13)
            {
               s += String.format("%s , ", datum1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
            }
             datum1 = datum1.plusDays(1);
        }
        System.out.println("Pátky 13.: ");
        System.out.println(s);
        
        
         
   
    }
    
}

