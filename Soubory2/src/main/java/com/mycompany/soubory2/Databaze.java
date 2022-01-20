/*
 *  Licence Tomas Cermak
 * 
 */
package com.mycompany.soubory2;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author cermak
 */
public class Databaze {
    
    private final DefaultListModel<Uzivatel> uzivatele;
    private final Path soubor;

    public Databaze(Path soubor) {
        uzivatele = new DefaultListModel<>();
        this.soubor = soubor;
    }

    public void pridejUzivatele(String jmeno, int vek, LocalDate registrovan) {
        uzivatele.addElement(new Uzivatel(jmeno, vek, registrovan));
    }

    public List<Uzivatel> vratVsechny() {
        return Collections.list(uzivatele.elements());
    }

    public ListModel<Uzivatel> getModel() {
        return uzivatele;
    }

    public void uloz() throws IOException {
        //nejprve soubor vytvoříme, pokud již existuje tak jej vyprázdníme
        Files.writeString(soubor, "", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        for (Uzivatel u : vratVsechny()) {
            String radek = u.getJmeno() + ";" + u.getVek() + ";" + u.getRegistrovan().toString() + System.lineSeparator();
            Files.writeString(soubor, radek, StandardOpenOption.APPEND);
        }
    }

    public void nacti() throws IOException {
        
    }
    
}
