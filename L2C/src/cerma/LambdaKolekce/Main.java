package cerma.LambdaKolekce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    List<Osoba> seznam = new ArrayList<>();
        seznam.add(new Osoba("Tomas","Cermak",35));
        seznam.add(new Osoba("Lenka","Cermakova",30));
        seznam.add(new Osoba("Vendulka","Cermakova",6));
        seznam.add(new Osoba("Aneta","Cermakova",3));

        for(int i = 0; i < seznam.size(); i++ ){
            System.out.println(seznam.get(i).getJmeno());

        }
        System.out.println("---------------------------");

        for(Osoba osoba: seznam){
            System.out.println(osoba.getJmeno());
        }

        //s Lambdou, for Each ma Rozhrani Consumer
        seznam.forEach((os)-> System.out.println(os.getJmeno()));

        //Reference na metodu, vypise objekty
        seznam.forEach(System.out::println);
}

}
