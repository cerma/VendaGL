/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datumpatky;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatumPatky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Pro zadaný interval datumů vypíše všechny pátky 13.:");
        System.out.println("Zadejte 1. datum:");
        String datum1 = sc.nextLine();
        System.out.println("Zadejte 2. datum:");
        String datum2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(datum1, DateTimeFormatter.ofPattern("d.M.y"));
        LocalDate date2 = LocalDate.parse(datum2, DateTimeFormatter.ofPattern("d.M.y"));
        long dny = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Pátky 13.:");
        LocalDate actDate = date1;
        for (long i = 0; i < dny; i ++) {
            if (actDate.getDayOfMonth() == 13 && actDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                System.out.printf("%s, ", actDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
            }
            actDate = actDate.plusDays(1);
        }
    }
}

