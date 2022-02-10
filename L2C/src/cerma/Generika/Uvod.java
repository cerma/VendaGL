package cerma.Generika;

public class Uvod {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {
        Uvod IntegerBox = new Uvod();
        IntegerBox.setObject("5");
        Integer cislo = (Integer) IntegerBox.getObject();// classCastException, Sting nelze pretypovat na Integer,classCastException- lze se vyhnout Generikou

        System.out.println(cislo);

    }
}
