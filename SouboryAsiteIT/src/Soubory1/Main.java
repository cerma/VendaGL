package Soubory1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("src/Soubory1/test.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path,"Prvni radek souboru"+System.lineSeparator(),StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(path,"Druhy radek"+System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(path, "A do třetice" + System.lineSeparator(), StandardOpenOption.APPEND);
//            CREATE - vytvoří nový soubor, nevyhazuje chybu, pokud už existuje
//            CREATE_NEW - vytvoří nový soubor, vyhodí chybu, pokud soubor už existuje
//            TRUNCATE_EXISTING - při otevření vymaže obsah souboru
//            APPEND - otevře soubor pro přidávání obsahu


        }
        catch (Exception e){
        System.out.println("Nelze vytvorit soubor "+e.getMessage());e.printStackTrace();}

    //pripsani radku do existujiciho souboru
    try {
        Files.writeString(path, "Tento text je na posledním řádku" + System.lineSeparator(), StandardOpenOption.APPEND);
    } catch (Exception ex) {
        System.out.println("Chyba při zápisu do souboru: " + ex.getMessage());

    }
    //cteni ze souboru
        try {
            List<String> vypis = Files.readAllLines(path);
            for(String s :vypis){
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Nepovedlo se precist soubor"+e.getMessage());
        }

    }

}
