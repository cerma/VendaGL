/*
 *  Licence Tomas Cermak
 * 
 */
package com.mycompany.soubory2;

import java.time.LocalDate;

/**
 *
 * @author cermak
 */
public class Uzivatel {
    private final String jmeno;
    private final int vek;
    private final LocalDate registrovan;

    public Uzivatel(String jmeno, int vek, LocalDate registrovan) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.registrovan = registrovan;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    public LocalDate getRegistrovan() {
        return registrovan;
    }

    @Override
    public String toString() {
        return jmeno;
    }
    
    
    
}
