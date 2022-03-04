import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Databaze {
    private final DefaultListModel<Osoba> uzivatele;
    private final Path soubor;


    public Databaze(Path soubor ) {
        uzivatele = new DefaultListModel<>();
        this.soubor = soubor;
    }

    public void pridejUzivatele(String jmeno, int vek, LocalDate registrovan) {
    uzivatele.addElement(new Osoba(jmeno, vek, registrovan)); // vytvoreni nove osoby a pridani do Listu uzivatele

    }

    public List<Osoba> vratVsechny() {
        return Collections.list(uzivatele.elements());// vraci list uzivatele
    }

    public ListModel<Osoba> getModel() {
        return uzivatele;
    }

    public void uloz() throws IOException {
        //nejprve soubor vytvoříme, pokud již existuje tak jej vyprázdníme
        Files.writeString(soubor, "", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);// pri otevreni vymaye obsah
        //pak projdeme všechny uživatele
        //a pro každého vytvoříme řádek s jeho vlastnostmi oddělenými středníkem
        //řádek poté zapíšeme do souboru
        for (Osoba u : vratVsechny()) {
            String radek = u.getJmeno() + ";" + u.getVek() + ";" + u.getRegistrovan().toString() + System.lineSeparator();
            Files.writeString(soubor, radek, StandardOpenOption.APPEND);
        }

    }

    public void nacti() throws IOException {
        //nejprve vyprázdníme uzivatele
        uzivatele.clear();
        try {
            //projdeme všechny řádky v souboru, každý rozdělíme na části podle středníků
            //rozdělené části pak použijeme pro přidání nového uživatele
            for (String radek : Files.readAllLines(soubor)) {
                String[] rozdeleno = radek.split(";");
                pridejUzivatele(rozdeleno[0], Integer.parseInt(rozdeleno[1]), LocalDate.parse(rozdeleno[2]));
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Databázi se nepodařilo načíst, soubor zřejmě neexistuje.");
        }

    }
}
