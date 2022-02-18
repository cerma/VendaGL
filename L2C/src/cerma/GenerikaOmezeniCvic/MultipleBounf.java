package cerma.GenerikaOmezeniCvic;

import java.io.Serializable;

public class MultipleBounf <P extends Osoba & Serializable> // kdyz je v omezeni vice parametru, je prvni Trida a pak Rozhrani, trida pak musi splnovat obe podminky

{
  private P objekt;

    public P getObjekt() {
        return objekt;
    }

    public void setObjekt(P objekt) {
        this.objekt = objekt;
    }

    public static void main(String[] args) {
        MultipleBounf<MalaOsoba> os = new MultipleBounf<>();

       // MultipleBounf<Osoba> os1 = new MultipleBounf<Osoba>(); tohle nejde protoze osoba neimplementuje rozhrani Serializable


    }

}
