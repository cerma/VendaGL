package cerma.Kolekce;

import java.util.HashMap;
import java.util.Map;

public class KolekceMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(); // hodnoty musi byt objekty

        map.put(10,"jaro");
        map.put(1,"fero");
        map.put(1,"fero2");
        map.put(3,"duro");
        map.put(4000,"karol");
        map.put(4000,"peter"); // prepise predchadzajuci element, podle klice

        System.out.println(map.get(1));

        for(Map.Entry m : map.entrySet()){
            System.out.printf("key %d, value %s %n",m.getKey(),m.getValue());
        }

        for(Integer k : map.keySet()){
            map.get(k);
        }

        map.values();
        map.containsKey(3);
        System.out.println(map.containsValue(4));
    }
}
