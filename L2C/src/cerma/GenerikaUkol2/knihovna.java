package cerma.GenerikaUkol2;

import java.util.ArrayList;
import java.util.List;

public class knihovna <S extends Osoba> {
    private S objektosoby;

    public static void main(String[] args) {
      metoda1("Ahoj");
      metoda1(4);
      metoda1(new Osoba("Tomas","Cermak",35));

      List<String> l = new ArrayList<>();
      l.add("Ahoj");
      l.add("Tome");
      metoda2(l);


    }
    public static <P> void metoda1(P prvek){
        System.out.println(prvek);

    }
    public static void metoda2(List<?> prvek){
        System.out.println(prvek);

    }
}
