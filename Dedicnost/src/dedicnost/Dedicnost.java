/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dedicnost;

/**
 *
 * @author cermak
 */
public class Dedicnost {

    /**
     * @param args the command line arguments
     */
  	public static void main(String[] args) {
	Admin pavel = new Admin(4);
	Admin tom = new Admin(10);
        Admin alois = new Admin(10);
	Uzivatel petr = new Uzivatel();
	
	pavel.vypis("pavel", "novak", 33);
	
	pavel.hlaska();
	petr.hlaska();
	tom.hlaska();
	pavel.obj(pavel);
	petr.obj(petr);
	
	System.out.println(pavel);
	
	


	}
}
