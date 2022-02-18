package cerma.RozhraniDefaltMetody;

public class Main implements RozhraniA,RozhraniB {


    @Override
    public void jed() {

    }

    @Override
    public void zastav() {
        RozhraniA.super.zastav();
        RozhraniB.super.zastav();
        System.out.println("Metoda bez inteface");
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.zastav();
    }

}
