/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naradi;

/**
 *
 * @author cermak
 */
public class Kladivo extends Nastroj{
    
    
    
    
    public boolean obourucni;
    
    public Kladivo(String nazev,int vaha, boolean obourucni){
    this.nazev = nazev;
    this.vaha = vaha;
    this.obourucni = obourucni;
    
    }
    
    
    
    @Override
    public String pracuj(){
    
    return "Zatloukám";
    }
    
}
