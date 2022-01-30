package com.cerma;

public class Data {
    private int rychlostVetru;
    private String pocasi;

    public Data(int rychlostVetru, String pocasi) {
        rychlostVetru = rychlostVetru;
        this.pocasi = pocasi;

    }
    public void KontrolaVetru() throws Exception{
        if (rychlostVetru > 35){
            throw new VitrException("Moc fouka ser na to");
        }
        else System.out.println("Moc nefouka, je to v pohode");
    }
    public void KontrolaPocasi(){
        if(pocasi.equals("prsi")){
            throw new PocasiException("Nechod tam, prsi tam, je tam velke blato");

        }
        else
            System.out.println("Je tam hezky, muzes jit");
    }
    public void MamJitVen(){
        KontrolaPocasi();

    }
}
