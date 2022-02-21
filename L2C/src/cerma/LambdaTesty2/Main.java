package cerma.LambdaTesty2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


    List<String> seznam = new ArrayList<>();
    Collections.addAll(seznam,"Tomas","Lenka","Vendulka","Anetka");

        Collections.sort(seznam,((a,b)-> a.compareTo(b)));
        System.out.println("Jmena v seznamu: ");
        vypis((ArrayList<String>) seznam,(jmeno)->true);
        System.out.println("__________________");

        System.out.println("Jmena zacinajici na A:");
        vypis((ArrayList<String>) seznam,(jmeno)->jmeno.startsWith("A"));

}


public static void vypis (ArrayList<String> jmena, Predicate<String> rozhrani){
        for(String jmeno: jmena){
            if(rozhrani.test(jmeno)) {
                System.out.println(jmeno);
            }
        }

}

}