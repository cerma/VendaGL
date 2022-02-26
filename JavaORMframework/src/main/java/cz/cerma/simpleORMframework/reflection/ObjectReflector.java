package cz.cerma.simpleORMframework.reflection;

import cz.cerma.simpleORMframework.anotace.Sloupec;
import cz.cerma.simpleORMframework.anotace.Tabulka;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ObjectReflector {

    public static <T> boolean isTable(Class<T> clazz) {
        return clazz.isAnnotationPresent(Tabulka.class); // vrati true, jestlize bude obsahovat anotaci tabulka
    }

    public static <T> String getTableName(Class<T> clazz) {
         return clazz.getAnnotation(Tabulka.class).value(); // zjisti hodnotu na Anotaci tabulky, class je opis Tabulky
    }

    public static <T> List<String> getColumnName(Class<T> clazz) {
        List<String> sloupce = new ArrayList<>();

        for(Field field: clazz.getDeclaredFields())// projizdi fieldy
        {
            if(field.isAnnotationPresent(Sloupec.class)){
                Sloupec sloupec = field.getAnnotation(Sloupec.class);
                sloupce.add(sloupec.value());
                System.out.println("Sloupec: "+sloupec.value()  );
            }

        }
        return  sloupce;
    }
}
