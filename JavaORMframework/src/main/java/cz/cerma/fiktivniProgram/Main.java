package cz.cerma.fiktivniProgram;

import cz.cerma.fiktivniProgram.entyty.Osoba;
import cz.cerma.simpleORMframework.DBacces.SormManager;

public class Main {
    public static void main(String[] args) {
        SormManager manager = new SormManager();
        Osoba osoba = manager.GetEntityByID(0L,Osoba.class);
    }
}
