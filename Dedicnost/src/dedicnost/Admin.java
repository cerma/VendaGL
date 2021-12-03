/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dedicnost;

/**
 *
 * @author cermak
 */
public class Admin extends Uzivatel{
    protected int i;
	public Admin(int i) {
		
		this.i = i;
	}

	@Override
	protected void hlaska() {
		System.out.println("Metoda hlaska v tride Admin");
		
		if (i > 5) {
			super.hlaska();
			
		}
	
		
	}
}
