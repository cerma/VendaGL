package cerma.Lambda4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> mesta = new ArrayList<>();
        mesta.add("Banská Bystrica");
        mesta.add("Prešov");
        mesta.add("Levice");
        mesta.add("Banská Šťavnica");
        mesta.add("Liptovský Trnovec");

        //setrizeni mest

        Collections.sort(mesta,(s1,s2)->s1.compareTo(s2) );

        //  printMesta(mesta);

        // printKratkeMesta(mesta);


        printWithFilter(mesta,s -> true);// vrati vsechny mesta
        System.out.println("----------------------");

        // Lambda
        printWithFilter(mesta,(filter)-> !filter.contains(" ")  );
        System.out.println("----------------------");

        printWithFilter(mesta,(filter)->filter.startsWith("B") );

    }


    // vypis serazenych mest
    private static void printMesta(ArrayList<String> mesta) {
        for (String mesto : mesta){
            System.out.println(mesto);
        }
    }
    // vypis jen jednoslovnych mest

    private static void printKratkeMesta(ArrayList<String> mesta) {
        for (String mesto : mesta){
            if (!mesto.contains(" ")){
                System.out.println(mesto);
            }

        }
    }
    private static void printWithFilter(List<String> mesta, Filter filter){
        for (String mesto : mesta){
            if (filter.odfiltruj(mesto)){
                System.out.println(mesto);
            }

        }

    }

}
