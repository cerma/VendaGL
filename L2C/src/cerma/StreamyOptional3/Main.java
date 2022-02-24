package cerma.StreamyOptional3;

import cerma.Generika.Osoba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Osoba> seznam = new ArrayList<>();
        seznam.add(new Osoba("Tomas","Cermak",35));
        seznam.add(new Osoba("Lenka","Cermakova",30));
        seznam.add(new Osoba("Vendulka","Cermakova",6));
        seznam.add(new Osoba("Aneta","Cermakova",3));
        seznam.add(new Osoba("Jitka","Mala",65));

        //najdi prvni, jestli existuje tak ji vypis
        //map premapuje Osobu na Optional, kde je mozne null aby nevyhodilo vyjimku
        seznam.stream().map(osoba -> Optional.ofNullable(osoba)).findFirst().ifPresent(osoba -> System.out.println(osoba));
    }
}
