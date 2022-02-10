package cerma.kolekceUkoly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trizeni {

    public static void main(String[] args) {
        List<String> jmena = new ArrayList<>();
        List<Osoba> names = new ArrayList<>();
        jmena.add("Tomas");
        jmena.add("Lenkaaaaa");
        jmena.add("Anetka");
        jmena.add("Vena");
        Collections.sort(jmena);
        //System.out.println(jmena);
        //trizeni v objektech
        Osoba tom = new Osoba("Tomas","Cermak",35);
        Osoba lenka = new Osoba("Lenka","Cermakova",29);
        Osoba venda = new Osoba("Vendulkaaa","Nase",6);
        Osoba anetka = new Osoba("Ana","Mamincina",3);
        names.add(tom);
        names.add(lenka);
        names.add(anetka);
        names.add(venda);


         Collections.sort(names);
        System.out.println(names);





    }


}
