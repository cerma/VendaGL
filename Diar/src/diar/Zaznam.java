/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diar;

import java.time.LocalDateTime;

/**
 *
 * @author cermak
 */
public class Zaznam {
    private LocalDateTime DatumCas;
    private String text;
    
    
 //kostruktor   
public Zaznam(LocalDateTime DatumCas,String text){
    this.DatumCas = DatumCas;
    this.text = text;
    }

    /**
     * @return the DatumCas
     */
    public LocalDateTime getDatumCas() {
        return DatumCas;
    }

    /**
     * @param DatumCas the DatumCas to set
     */
    public void setDatumCas(LocalDateTime DatumCas) {
        this.DatumCas = DatumCas;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

@Override
public String toString(){
return DatumCas + " " + text;

}
}
