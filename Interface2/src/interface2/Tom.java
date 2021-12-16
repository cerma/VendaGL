/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author cermak
 */
public abstract class Tom implements Comparable{
    protected int vek;
    public Tom(int vek){
        this.vek = vek;
    
    
    }
    
    
    public void Chodit(){
        System.out.println("Chodim");
    
    }
    protected abstract void SmatSe();
    
    /**
     *
     */
    public int compareTo(Object z){
    
        return 15;
    
    
    }
    
   
    
}
