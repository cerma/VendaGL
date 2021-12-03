/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programatori;

/**
 *
 * @author cermak
 */
public class Clovek {
    

  
    protected String jmeno;
    protected int vek;
    protected double unava = 0;


    public Clovek(String jmeno, int vek)
    {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public void spi(int doba)
    {
        unava -= doba * 10;
        if (unava < 0)
            unava = 0;
    }


    public void behej(int vzdalenost)
    {
        if (unava + vzdalenost <= 20)
            unava += vzdalenost;
        else
            System.out.println("Jsem příliš unavený");
    }

  
    @Override
    public String toString()
    {
        return String.format("%s (%d)", jmeno, vek);
    }
}
    

