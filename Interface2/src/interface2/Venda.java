/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author cermak
 */
public class Venda extends Tom implements DetiInterface{

    public Venda(int vek) {
        super(vek);
    }

    @Override
    public void SmatSe() {
        System.out.println("Venda se smeje");
    }
    
    public void Cist(){
        System.out.println("Ctu");
    
    
    }

  
    
    
    
}
