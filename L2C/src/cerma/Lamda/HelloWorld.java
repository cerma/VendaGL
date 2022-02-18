package cerma.Lamda;

public class HelloWorld {
    public void Pozdrav(){
        System.out.println("Hello world");
    }
    public void Pozdrav2(IhelooWorld rozhrani){
    rozhrani.SayHallo();


    }
    public static void main(String[] args) {
        HelloWorld zdravim = new HelloWorld();

        zdravim.Pozdrav();
        zdravim.Pozdrav2(()-> System.out.println("Haloo world impls"));
    }

    public class Helo implements IhelooWorld{
        @Override
        public void SayHallo() {
            System.out.println("Hello world");
        }
    }
}
