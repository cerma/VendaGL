package cerma.RegularniVyrazy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
vyhledavani();


    }
    private static void vyhledavani(){
        //vysledek("9*"," aaaa"); //hleda se 9 * - je 0 az Nkrat + - 1 az Nkrat
       // vysledek("9{4}","99999"); // slozene zavorky znamenaji pocet prvku pred nima
        //vysledek("[abc]{3}","abcabcabcbbbbc"); // a, b, nebo c trikrat za sebou aaa,bbb,ccc,abc,aab...
        test("[a-z]*@[a-z]*","asd@sdjfks.cz");
    }
    private static void vysledek(String pattern,String text){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean found = false;
        //ak nebude na konzole nic tak sa nic nenaslo
        while (m.find()) {
            System.out.println("Nasel sem text: " + m.group());// shodujici se text
            System.out.println("zacatek: " + m.start());// start index
            System.out.println("konec: " + m.end());// end index
            System.out.println("______________");
            found = true;
        }
        if (!found) {
            System.out.println("Nic sem nenasel");
            System.out.println("______________");
        }


    }
    private static void test(String s,String text){
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(text);

        if (m.find()){

            System.out.println("Proslo");
        }
        else
            System.out.println("Neproslo");




    }
}
