package cerma.Kolekce;
import cerma.Stream.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrideniElementu {
    public static void main(String[] args) {
        Osoba []  osobyArray= {
                new Osoba("tom","cermak",35),
        new Osoba("lenka","cermakova",50),
        new Osoba("jaro","beno",20),
        };

        List<Osoba> osoby = Arrays.asList(osobyArray);

        System.out.println(osoby);

        Collections.sort(osoby);

        System.out.println(osoby);


    }

}
