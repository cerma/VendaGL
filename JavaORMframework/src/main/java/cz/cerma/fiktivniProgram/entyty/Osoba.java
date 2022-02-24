package cz.cerma.fiktivniProgram.entyty;

import cz.cerma.simpleORMframework.anotace.ID;
import cz.cerma.simpleORMframework.anotace.Sloupec;
import cz.cerma.simpleORMframework.anotace.Tabulka;
@Tabulka("Osoba")

public class Osoba {
    @ID
    @Sloupec("ID")
    private long id;

    @Sloupec("Name")
    private String name;

    @Sloupec("Surname")
    private String surname;

    @Sloupec("Adress")
    private String adress;



}
