package cerma.Kolekce;

import java.util.HashSet;
import java.util.Set;

public class KolekceSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("element1");
        set1.add("element2");
        set1.add("element3");
        set1.add("element4");

        Set<String> set2 = new HashSet<>();

        set2.add("element1");
        set2.add("element2");
        set2.add("element3");
        set2.add("element4");

        prnt(set1);
        prnt(set2);
        System.out.println(set1.contains("element1"));
        set1.remove("element1");
        prnt(set1);


    }
    public static void prnt(Set<String> set){
        System.out.println("set:");
        for(String s : set){
            System.out.println(s);


        }

    }
}
