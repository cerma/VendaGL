package cerma.RozhraniDefaltMetody;

public interface RozhraniA {
    void jed();

   default void zastav(){
       System.out.println("Rozhrani A");

   }
}
