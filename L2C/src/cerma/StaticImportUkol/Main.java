package cerma.StaticImportUkol;
import static java.lang.Math.*; // import statickych prvku z Math

public class Main {
    public static void main(String[] args) {
        double d = 5.23;
        System.out.printf("Zaokrouhleni cisla %.2f nahoru je cislo %d",d,zaokrouhli(d));   }


    public static int zaokrouhli(double d){

        int i = (int) ceil(d);


    return i;
    }

}
