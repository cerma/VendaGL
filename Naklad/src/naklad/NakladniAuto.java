/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naklad;

/**
 *
 * @author cermak
 */
public class NakladniAuto {
    public int hmotnost = 0;
    
    public void naklad(int i){
    if (i + hmotnost < 3000){
    hmotnost = hmotnost +i;
    }
    
    }
    public void vyklad(int i){
    if (hmotnost - i > 0){
    hmotnost = hmotnost -i;
    }
    
    }
    
}
