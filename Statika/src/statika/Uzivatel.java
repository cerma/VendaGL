/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statika;

/**
 *
 * @author cermak
 */
public class Uzivatel {
    private String jmeno;
    private String heslo;
    private boolean  prihlasen;
    public static int MinimalniDelkaHesla = 6;
    private int id;
    private static int dalsiId;
    
    public Uzivatel(String jmeno,String Heslo){
    this.jmeno = jmeno;
    this.heslo = heslo;
    prihlasen = false;
    id = dalsiId;
        dalsiId++;
    
    }
       public boolean prihlasSe(String zadaneHeslo) {
        if (zadaneHeslo.equals(heslo)) {
            prihlasen = true;
            return true;
        } else {
            return false; // hesla nesouhlasí
        }
    }
       
       
       public static boolean ZvalidujHeslo(String heslo){
       if (heslo.length()>= MinimalniDelkaHesla)
       return true;
else
           return false;
       }
    
}
