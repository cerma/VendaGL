package cerma.Lambda4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mesta = new ArrayList<>();
        mesta.add("Banská Bystrica");
        mesta.add("Prešov");
        mesta.add("Levice");
        mesta.add("Banská Šťavnica");
        mesta.add("Liptovský Trnovec");

        //setrizeni mest

        Collections.sort(mesta, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
     //  printMesta(mesta);

       // printKratkeMesta(mesta);

        // takto by to bylo pres vnitrni anonymni tridu
        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odfiltruj(String s) {
                return !s.contains(" ");
            }
        });
        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odfiltruj(String s) {
                return s.startsWith("B");
            }
        });

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
    private static void printWithFilter(List<String> mesta,Filter filter){
        for (String mesto : mesta){
            if (filter.odfiltruj(mesto)){
                System.out.println(mesto);
            }

        }

    }


}
