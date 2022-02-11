package cerma.Generika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerickeMetody2 {

    public <T>void GenerickaMetoda(T jesteNevim)// parametr se uvadi pred vystupni hodnotou metody

    {
        System.out.println(jesteNevim);


    }

   public static void main(String[] args) {
        GenerickeMetody2 test = new GenerickeMetody2();

        test.GenerickaMetoda("Sting to bude");


    }

}
