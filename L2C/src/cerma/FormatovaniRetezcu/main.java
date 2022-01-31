package cerma.FormatovaniRetezcu;

import java.util.Calendar;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String t = "Tom";
        String s = String.format("Ahoj ja jsem %s", t);// stejne jako printf

       // System.out.printf("Ahoj ja jsem %s", t);
        //advance();
        System.out.printf("%2$10s ma: %d \n",10,"Jaro");// 10s je sirka, odsazeni
        System.out.printf("%2$-10s ma: %d \n",10,"Jaro"); //- left justified flag

        System.out.printf("%2$10.2s mĂˇ: %d %n",10,"Jaro");

        //argument indexes
        System.out.printf("%s %s %s %s", "a", "b", "c", "d");
        System.out.println();
        System.out.printf("%2$s %s %<s %s", "a", "b", "c", "d"); //poslednĂ© %s by sa zdalo, Ĺľe pouĹľije d, ale namiesto toho je to druhĂ˝ argument bez ĹˇpecifikĂˇcie poradia, tak zoberie druhĂ˝ znak
        System.out.println();


        System.out.printf("%2$s %<s %<s", "a", "b");
        System.out.println();

        System.out.printf("%1$s %s %s", "Jaroslav"); //error
        System.out.printf("%1.2$s %s %s", "Jaroslav");
        System.out.printf("%1$.2s %<s ", "Jaroslav");




    }

    private static void advance() {
        Calendar c = Calendar.getInstance(Locale.forLanguageTag("sk_SK"));
        String s1 = String.format("Jarove narodky: %1$td %1$tb %1$ty", c);//1$ odkazuje na jediny parametr co tam je-argument index, index je zde od 1
        String s2 = String.format("Jarove narodky: %1$Td %1$Tb %1$Ty", c); //error
         String s3 = String.format("Jarove narodky: %1$TD %1$TB %1$TY", c); //error
        System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
    }
}