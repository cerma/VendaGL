/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datumacas;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author cermak
 */
public class DatumACas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDateTime datumcas = LocalDateTime.of(2016,Month.APRIL,15,3,15);
        System.out.println(datumcas);
        
        
        //aktualni datum cas
        LocalDateTime dcas = LocalDateTime.now();
        System.out.println(dcas);
        
        System.out.println(dcas.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(dcas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(dcas.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT)));
        System.out.println(dcas.format(DateTimeFormatter.ofPattern("d.M.y H:m:ss")));
        //porovnavani 
        LocalDate halloween = LocalDate.of(2016, 10, 31);
        LocalDate vanoce = LocalDate.of(2016, 12, 25);
        System.out.println("po: " + halloween.isAfter(vanoce));
        System.out.println("před: " + halloween.isBefore(vanoce));
        System.out.println("shodný: " + vanoce.isEqual(halloween));
        System.out.println("shodný: " + halloween.isEqual(halloween));
        System.out.println("přestupný: " + halloween.isLeapYear());
        System.out.println("přestupný: " + halloween.withYear(2017).isLeapYear());
        System.out.println("podporuje hodiny: " + halloween.isSupported(ChronoUnit.HOURS));
        System.out.println("podporuje roky: " + halloween.isSupported(ChronoUnit.YEARS));
        
        
      
    }
    
}
