package cerma.GenerikaOmezeniCvic;

public class BoundedType<P extends Osoba> {
    private P ojekt;

    public P getOjekt() {
        return ojekt;
    }

    public void setOjekt(P ojekt) {
        this.ojekt = ojekt;
    }

    public void test(){
        ojekt.setPrijmeni("Cermak");



    }

}
