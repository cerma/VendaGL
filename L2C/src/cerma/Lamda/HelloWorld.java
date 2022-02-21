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
        HelooWorld2 pozdrav = new HelooWorld2();

        zdravim.Pozdrav();
        zdravim.Pozdrav2(()-> System.out.println("Haloo world impls"));

        Ilambda printHelloWorld = () -> System.out.println("Hello world");
        Ilambda test = () -> System.out.println("vypis Lambdy 2");
        pozdrav.prnt(printHelloWorld);
        pozdrav.prnt(test);
    }

    public class Helo implements IhelooWorld{
        @Override
        public void SayHallo() {
            System.out.println("Hello world");//xxx
        }
    }
}
