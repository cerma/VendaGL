/*
 *  Licence Tomas Cermak
 * 
 */
package enum2;

import java.util.EnumSet;

/**
 *
 * @author cermak
 */
public class Data {
    public EnumJava barva;
    //EnumSet nabyva vice hodnot
    public EnumSet acces;
    public int i;
    //staticka - nejde vytvo5it instance nezabira pamet, final - nelze zmenit
    public static final int konstanta = 10;
    
    
    
   public Data(int i){
       this.i = i;
   if (i > 1)
       barva = EnumJava.modra;
   
   
   acces = EnumSet.of(Prava.Cteni,Prava.Spusteni);
   }

    
}
