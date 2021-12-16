/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author cermak
 */
public abstract class Zvire implements Comparable{
    protected int vaha;
    
        public Zvire(int vaha){
        this.vaha = vaha;
        }

    /**
     * @return the vaha
     */
    public int getVaha() {
        return vaha;
    }

    /**
     * @param vaha the vaha to set
     */
    public void setVaha(int vaha) {
        this.vaha = vaha;
    }
    public void dychej(){
        System.out.println("Dycham...");
    
    }
     @Override
    public String toString(){
            
       return String.format("Tohle je zvire, vazi %d kilogramu ", vaha);
            }
    
    public abstract void presunSe();

    @Override
    public int compareTo(Object t) {
        Zvire test2 = (Zvire)t;
            if (this.vaha < test2.vaha) {
        return -1;
    }
    if (this.vaha > test2.vaha) {
        return 1;
    }
    return 0;
    }
    }
    
    
    

