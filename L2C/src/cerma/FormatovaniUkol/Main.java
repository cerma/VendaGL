package cerma.FormatovaniUkol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        metoda1("ahoj tomAs Cermak");
        metoda2("ahoj tomAs Cermak");
        metoda3("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        metoda4("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        metoda5("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        metoda6("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        metoda7("Tomas Cermak Veliky");
        metoda8("[header]Ac mi[/header] massa ac [code]praesent eget[/code], aliquam egestas suscipit, potenti massa, porttitor [link:www.learn2code.sk] gravida quis ac velit facilisi[/link], imperdiet massa rhoncus felis arcu. Ut nullam, mauris vitae, ligula quisque est.");

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
    //@ misto a A
    public static void metoda2(String s ){
        s=s.replace("a","@");
        s=s.replace("A","@");
        System.out.println(s);

    }
    // text po posledni ","
    public static void metoda3(String s){
       System.out.println( s.substring(0,s.lastIndexOf(",")).replace(",",""));

    }
    //text pred a po ","
    public static void metoda4(String s){
        String upr="";
        upr = s.substring(0,s.indexOf(",")) + s.substring(s.lastIndexOf(","));
        upr = upr.replace(",","");

        System.out.println(upr);

    }
    //statistiky
    public static void metoda5(String s){


        String[] textToWords = s.split(" ");
        System.out.println("Pocet slov je: " + (textToWords.length + 1));
        System.out.println("Pocet znaku je: " + (s.length()));

        int prazneznaky = s.length() - s.replaceAll(" ", "").length();
        System.out.println("Pocet prazdnych znaku je: " + prazneznaky);

        int carky = s.length() - s.replaceAll(",", "").length();
        System.out.println("Pocet carek je celkem: " + carky);

        int tecky = s.length() - s.replaceAll("\\.", "").length();
        System.out.println("Pocet tecek je celkem: " + tecky);

        int Velka = 0;

        for (String sign : textToWords) {
            if (Character.isUpperCase(sign.charAt(0))) {
                Velka++;
            }
        }
        System.out.println("Pocet slov s velkym pismenem na zacatku je: " + Velka);

    }
    //kazde druhe pismeno velke
    public static void metoda6(String text) {
        String etext = text.replaceAll(",", "")
                .replaceAll("\\.", "")
                .toLowerCase();

        String[] textToWord = etext.split(" ");
        for (int i = 0; i < textToWord.length; i++) {

            char[] wordToChars = textToWord[i].toCharArray();
            for (int j = 0; j < wordToChars.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(Character.toUpperCase(wordToChars[j]));
                } else {
                    System.out.print(Character.toLowerCase(wordToChars[j]));
                }
            }
            System.out.print(" ");

        }
        System.out.println();
    }
// inicialy
    public static void metoda7(String s) {
        String[] slovo = s.split(" ");
        String initials = "";


        for (int i = 0; i < slovo.length; i++) {


            char[] wordsToChars = slovo[i].toCharArray();
            initials = String.valueOf(Character.toUpperCase(wordsToChars[0]));
            System.out.print(initials);

            if (i != slovo.length-1) {
                System.out.print(".");
            }

        }




    }
    // uprava HTML znacky
    public static void metoda8(String s) {
        System.out.println();
        String editedText = s.replaceAll("\\[", "<")
                .replaceAll("]", ">")
                .replaceAll("header", "h1")
                .replace("link:", " a href = ")
                .replaceAll("www.learn2code.sk", "\"www.learn2code.sk\"")
                .replace("[/link]", "</a>");
        System.out.println(editedText);

    }


}
