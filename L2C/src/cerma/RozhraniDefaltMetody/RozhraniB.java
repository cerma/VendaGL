package cerma.RozhraniDefaltMetody;

public interface RozhraniB {
    void jed();

    default void zastav()// default metoda se nemusi implementovat ve tride, ktera implementuje toto rozhrani
    {
        System.out.println("Rozhrani B");

    }
}
