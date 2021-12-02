/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptacek;

/**
 *
 * @author cermak
 */
public class AngryPtak extends Ptak{
    	protected int vztek = 50;
	
	public void provokuj(int a) {
		
		if (hlad > 99) {
			vztek = vztek + (2*a);
			
		}
		else 
			vztek += a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Jsem angry-pták s váhou %d a hladem %d, míra mého vzteku je %d.", vaha,hlad,vztek);
	}
	
    
}
