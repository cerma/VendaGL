package cerma.StreamyOptional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        basicOptional();

        moreOptional();


    }

    private static void moreOptional() {
        Optional<String> jmeno = Optional.of("Tomas");
        Optional<String> prazdne = Optional.empty();

      /*  jmeno.isPresent();// jesltize neni prazdny vraci true
        jmeno.ifPresent();// vykona akci v zavorce jestli neni prazdny, jinak false*/

        if (jmeno.isPresent()){
            System.out.println("Jmeno: "+jmeno.get());}
        else
            System.out.println("jmeno tam neni");


        jmeno.ifPresent(m-> System.out.println("jmeno tam je/if present"));

    }

    private static void basicOptional() {
        Optional<String> jmeno = Optional.of("Tomas");
        String hodnota1 = "hodnota";
        String hodnota2 = null;

        System.out.println("Optional jmeno: "+jmeno);
        System.out.println("Optional jmeno: "+jmeno.get());
        System.out.println("Optional prazdny: "+Optional.empty());

        System.out.println("OfNullable na neprazdnem Optional"+Optional.ofNullable(hodnota1));
        System.out.println("OfNullable na prazdnem Optional"+Optional.ofNullable(hodnota2));
        //vyjimka null pointer E
       // System.out.println("Of na prazdnem Optional"+Optional.of(hodnota2));
    }

}
