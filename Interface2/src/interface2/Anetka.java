/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author cermak
 */
public class Anetka extends Tom implements DetiInterface{

    public Anetka(int vek) {
        super(vek);
    }

    @Override
    public void SmatSe() {
        System.out.println("Anetka se smeje");
    }

    @Override
    public void Cist() {
        System.out.println("Anetka cte");
    }
    
}
