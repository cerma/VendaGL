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


    }

    public static void VypisJmen(List<String> s){

        System.out.println(s);

    }
    public static void PridatPrvekNaPrvnimMiste(String s ){


    }
}


