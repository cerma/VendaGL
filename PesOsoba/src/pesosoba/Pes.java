/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesosoba;

/**
 *
 * @author cermak
 */
public class Pes {
    public int vek;
    public String jmeno;
    
    
    public Pes(int vek,String jmeno){
    this.jmeno = jmeno;
    this.vek = vek;
    }
    
    public void zestarni() {
        this.vek++;

}
    
}
