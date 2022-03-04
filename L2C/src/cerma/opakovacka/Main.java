package cerma.opakovacka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Auto> bazar = new ArrayList<>();
    public static void main(String[] args) {
        ProdejSlambdou(() -> System.out.println("prodej s Lambdou"));
        Parkovani park = new Parkovani();

        Auto skoda = park.parkuj(10,"Misto");



    }


    public void PridejAuto(Auto auto){
        bazar.add(auto);
    }
    public void ukazAuta(){
        bazar.stream().forEach(auto -> System.out.println(auto));

    }
    public static void ProdejSlambdou(Idoprava rozhrani){
        rozhrani.prodej();

    }

}
