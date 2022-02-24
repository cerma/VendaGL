package cerma.StremyOptional2;

import java.util.Locale;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        realLife();

    }
    private static void realLife(){
        Osoba o = new Osoba("Tomas", null,35);
        //jestli ta hodnota v prijmeni je, da se na uppercase, vyhneme se tak vyjimce
        o.getPrijmeni().ifPresent(os-> System.out.println(os.toUpperCase()));

    }
}
