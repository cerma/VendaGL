/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prevodstupnu;

/**
 *
 * @author cermak
 */
public class Prevodnik {
    
    
    public static double PrevodNaStupne(double radiany){
        double stupne = radiany * 180 / Math.PI;
    
    return stupne;
    
    }
      public static double PrevodNaRadiany(double stupne){
        double radiany = stupne*Math.PI/180;
    
    return radiany;
    
    }
    
}
