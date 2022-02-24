package cerma.Reflexe;

import cerma.Generika.Osoba;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> trida = Osoba.class;
        System.out.println(trida.getCanonicalName()); //vypis trida
        Package p = trida.getPackage();// balicek
        System.out.println(p);

        System.out.println(Arrays.toString(trida.getClasses())); // tridy
       // trida.getConstructor();// konstrukktor
        System.out.println(Arrays.toString(trida.getMethods()));// metody
        //...






    }
}
