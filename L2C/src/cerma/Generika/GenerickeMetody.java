package cerma.Generika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerickeMetody {


    private static <T>ArrayList<T> preklopMapNaList(HashMap<Long,T> collection){
        ArrayList<T> list = new ArrayList<>();
        for(Long key : collection.keySet()){
            list.add(collection.get(key));
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        LinkedHashMap<Long,String> stringLinkedHashMap = new LinkedHashMap<>();

        stringList = preklopMapNaList(stringLinkedHashMap);
        stringList = GenerickeMetody.preklopMapNaList(stringLinkedHashMap);


    }
}
