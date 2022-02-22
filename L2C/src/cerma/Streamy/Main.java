package cerma.Streamy;

import cerma.Generika.Osoba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    List<Osoba> seznam = new ArrayList<>();
        seznam.add(new Osoba("Tomas","Cermak",35));
        seznam.add(new Osoba("Lenka","Cermakova",30));
        seznam.add(new Osoba("Vendulka","Cermakova",6));
        seznam.add(new Osoba("Aneta","Cermakova",3));
        seznam.add(new Osoba("Jitka","Mala",65));


        //stream
        seznam.stream()

                .filter(osoba -> osoba.getVek() < 30)
                .forEach(osoba -> System.out.println(osoba.getJmeno()));//sout je ukoncovac, tak musi stream koncit

        System.out.println("-------------------------------");

        List<Integer> list =seznam.stream()
                .filter(osoba -> osoba.getVek()<31)
                .sorted(Comparator.comparing(osoba -> osoba.getVek()))
                .map(osoba -> osoba.getVek())

                .collect(Collectors.toList());//prida vysledek do listu

        list.forEach(s-> System.out.println(s));



    }
}
