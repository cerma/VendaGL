/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dedicnost;

/**
 *
 * @author cermak
 */
public class Uzivatel {
    protected String jmeno;
protected String prijmeni;
protected int vek;





protected void vypis(String jmeno,String prijmeni,int vek) {
	this.vek = vek;
	this.jmeno = jmeno;
	this.prijmeni = prijmeni;
	
	System.out.printf("jmeno: %s prijmeni: %s, vek: %d %n", jmeno,prijmeni,vek);
}

protected void hlaska() {
	System.out.println("Metoda hlaska v tride uzivatel");
	
	
}

protected void obj(Uzivatel a) {
	if (a instanceof Admin) {
		
		System.out.println("instance Admina");
	}
	else {
		System.out.println("instance Uzivatele");
	}
}



@Override 
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Vypis objektu na string %s %s", jmeno,prijmeni);
		
	}
}
