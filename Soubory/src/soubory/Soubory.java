/*
 *  Licence Tomas Cermak
 * 
 */
package soubory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


/**
 *
 * @author cermak
 */
public class Soubory {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        //zjisteni domovskeho adresare
        // String s =System.getProperty("user.home");
        //     System.out.println(s);
        //definice cesty souboru
        Path path = Paths.get("C:\\Users\\cermak\\ITnetwork\\test.txt");

        try {
            //jestli neexistuje slozka, tak se vytvori
            Files.createDirectories(path.getParent());
            
            /*CREATE - vytvoří nový soubor, nevyhazuje chybu, pokud už existuje
           * CREATE_NEW - vytvoří nový soubor, vyhodí chybu, pokud soubor už existuje
           ** TRUNCATE_EXISTING - při otevření vymaže obsah souboru
           * APPEND - otevře soubor pro přidávání obsahu*/
            Files.writeString(path, "První řádek" + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(path, "Tento text je na druhém řádku" + System.lineSeparator(), StandardOpenOption.APPEND);
            Files.writeString(path, "A do třetice" + System.lineSeparator(), StandardOpenOption.APPEND);
            
        } catch (Exception e) {

            System.out.println("Nelze zapisovat do souboru");
        }
        //cteni ze souboru
        try {
    List<String> lines = Files.readAllLines(path);
    for(String l : lines){
    System.out.println(l);
    
    //i tak by to slo:
    //  lines.forEach(System.out::println);
    
    }
    
    
} catch (IOException ex) {
    System.out.println("Chyba při čtení souboru: " + ex.getMessage());
}

    }

}
