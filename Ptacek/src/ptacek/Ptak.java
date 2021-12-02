/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptacek;

/**
 *
 * @author cermak
 */
public class Ptak {
    protected int hlad = 100;
protected int vaha = 50;

public void snez(int a) {
	vaha += a;
	hlad -= a;	
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Jsem pták s váhou %d a hladem %d.", vaha,hlad);
	}

}
