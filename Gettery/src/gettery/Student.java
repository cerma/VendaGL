/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettery;

/**
 *
 * @author cermak
 */
public class Student {
    
    private String jmeno;
    private boolean muz;
    private int vek;
    private boolean plnolety;
    
    public Student(String jmeno,boolean muz,int vek){
    this.jmeno = jmeno;
    this.vek = vek;
    this.muz = muz;
        setVek(vek);
    }
    
        @Override
    public String toString() {
        String jsemPlnolety = "jsem";
        if (!isPlnolety()) {
            jsemPlnolety = "nejsem";
        }
        String pohlavi = "muž";
        if (!isMuz()) {
            pohlavi = "žena";
        }
        return String.format("Jsem %s, %s. Je mi %d let a %s plnoletý.", getJmeno(), pohlavi, getVek(), jsemPlnolety);
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the muz
     */
    public boolean isMuz() {
        return muz;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @return the plnolety
     */
    public boolean isPlnolety() {
        return plnolety;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
        if (vek <18)
            plnolety = false;
        else plnolety = true;
        
    }
    
}
