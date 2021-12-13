/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datumsoucty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author cermak
 */
public class DatumSoucty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for (int i = 0;i<7;i++){
        LocalDateTime datumCas = LocalDateTime.now();
        datumCas = datumCas.plusDays(i);
        System.out.print(datumCas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        
        int soucet = datumCas.getYear() + datumCas.getMonthValue() + datumCas.getDayOfMonth();  
         System.out.println(" - "+soucet);
        }
        
    }
    
}
