package cerma.Generika;

public class BoundetType<P extends Pes >  {
private P objektPsa;

    public P getObjektPsa() {
        return objektPsa;
    }

    public void setObjektPsa(P objektPsa) {
        this.objektPsa = objektPsa;
    }

    public void stekej(){
        objektPsa.stekej();


    }

    public static void main(String[] args) {
        BoundetType<Pes> psik = new BoundetType();
        BoundetType<NejakyPes> psik2 = new BoundetType();  // muzou byt pouzity jen Objekty ze tridy pes, nebo ty, ktere od psa dedi

        psik.setObjektPsa(new Pes("Alik"));
        psik.stekej();



    }
}
