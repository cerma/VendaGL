/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nahodnevety;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Random;
/**
 *
 * @author cermak
 */
public class GeneratorVet {
    
     private Random rand;
     
     public GeneratorVet(){
        rand = new Random();
     
     }

    private int nahodnecislo;

    private String[] podmety = {"jednorožec","programátor","manažer","hroch","T-rex"};
    private String[] prisudky = {"spal","ležel","vařil","uklízel","derivoval"};
    private String[] privlastky = {"modrý","velký","hubený","nejlepší","automatizovaný"};
    private String[] prislovce = {"rychle","s oblibou","hodně","málo","se zpožděním"};
    private String[] mista = {"pod stolem","v lese","u babičky","v práci","na stole"};
    
   
    
      
      public String generator(){
        String podmet = podmety[rand.nextInt(5)];
        String prisudek = prisudky[rand.nextInt(5)];
        String privlastek = privlastky[rand.nextInt(5)];
        String prislovec = prislovce[rand.nextInt(5)];
        String misto = mista[rand.nextInt(5)];
        
    return String.format("%s %s %s %s %s\n", privlastek, podmet, prisudek, prislovec, misto);
        
      }
    
    
    
}
