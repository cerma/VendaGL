package cerma.kolekceUkoly;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> jmena = new ArrayList<>();
        jmena.add("Tomas");
        jmena.add("Lenka");
        jmena.add("Vojta");
        VypisJmen(jmena);

        //prvek na prvni misto
        jmena.add(0,"Anetka");
        VypisJmen(jmena);

        //nahradit prvek na druhem miste
        jmena.remove(1);
        jmena.add(1,"Vendulka");
        VypisJmen(jmena);

        System.out.println("Index hledaneho jmena je: "+HledacJmen(jmena,"Lenka"));

        //vypis hledaneho prvku
        System.out.println(jmena.get(HledacJmen(jmena,"Lenka")));

        



    }

    public static void VypisJmen(List<String> s){

        System.out.println(s);

    }
    //hleda index shodne jmena, jestli nenajde vrati -1
    public static int HledacJmen(List<String> l,String s){
        if (l.contains(s)){
            return l.indexOf(s);

        }
    else return -1;
    }
}


