package cerma.Generika;

import cerma.GenerikaUkol2.MalaOsoba;

public class MultipleGenericBox<P,T> {

    private P objekt1;
    private T objekt2;

    public void add(P objekt1,T objekt2){
        this.objekt1 = objekt1;
        this.objekt2 = objekt2;



    }

    public static void main(String[] args) {
        MultipleGenericBox<String,Integer> boxik = new MultipleGenericBox<>();
        boxik.add("Tomas",35);

        MultipleGenericBox<Osoba, String> boxik2 = new MultipleGenericBox<>();
        boxik2.add(new Osoba("Tomas","Cermak",35),"Boxik2");

    }

}
