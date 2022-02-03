package cerma.FormatovaniUkol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

metoda1("ahoj tomAs Cermak");
    }
    public static void metoda1(String s){
      String uprText= "";
      s=  s.toLowerCase();
      String [] slova = s.split(" ");

      for (String word : slova){
          uprText += word.substring(0, word.length() - 1).toLowerCase() + Character.toUpperCase(word.charAt(word.length() - 1)) + " ";//posledni pismeno velke, zbytek maly

      }
System.out.println(uprText);

    }


}
