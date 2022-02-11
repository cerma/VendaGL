package cerma.Generika;

public class UvodGenericky<P> {
    private P object;

    public void setObject(P object) {
        this.object = object;
    }

    public P getObject() {
        return object;
    }

    public static void main(String[] args) {
       UvodGenericky<String> stringGenericBox = new UvodGenericky<>();
       stringGenericBox.setObject("toto je string");

       String p = stringGenericBox.getObject();

        UvodGenericky<Integer> intGenericBox = new UvodGenericky<>();
        intGenericBox.setObject(25);

        int s = intGenericBox.getObject();


    }
}
