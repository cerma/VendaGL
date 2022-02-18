package cerma.LambdaTesty;

public class Main {

    public void prepis(Iprint rozhrani){
        rozhrani.tisk();

    }



    public static void main(String[] args) {

    Main printer = new Main();
    //bez lambdy
    printer.prepis(new Iprint() {
        @Override
        public void tisk() {
            System.out.println("prepis");
        }
    });
    //s lambdou
        printer.prepis(()-> System.out.println("lambda prepis"));



}

}
