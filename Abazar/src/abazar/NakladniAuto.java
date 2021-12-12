/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abazar;

/**
 *
 * @author cermak
 */
public class NakladniAuto extends Auto{
    private int nosnost;
    public NakladniAuto(String SPZ, String znacka, int cena,int nosnost) {
        super(SPZ, znacka, cena);
        this.nosnost = nosnost;
    }
    
}
