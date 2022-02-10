package cerma.Generika;

public class UvodGenericky<P> {
    private P object;

    public void setObject(P object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {
        UvodGenericky IntegerBox = new UvodGenericky();
        IntegerBox.setObject("5");
        Integer cislo = (Integer) IntegerBox.getObject();// classCastException, Sting nelze pretypovat na Integer,classCastException- lze se vyhnout Generikou

        System.out.println(cislo);

    }
}
