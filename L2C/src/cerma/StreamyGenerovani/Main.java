package cerma.StreamyGenerovani;

import cerma.Generika.Osoba;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


            List<Osoba> seznam = new ArrayList<>();
            seznam.add(new Osoba("Tomas","Cermak",35));
            seznam.add(new Osoba("Lenka","Cermakova",30));
            seznam.add(new Osoba("Vendulka","Cermakova",6));
            seznam.add(new Osoba("Aneta","Cermakova",3));
            seznam.add(new Osoba("Jitka","Mala",65));

    //generovani streamu, vraci stream
    seznam.stream();
        }

}
