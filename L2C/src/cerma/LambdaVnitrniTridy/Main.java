package cerma.LambdaVnitrniTridy;

public class Main {

    public static void main(String[] args) {

        //bez pomoci Lambda
    Ilambda lamda = new Ilambda() {
        @Override
        public void print() {
            System.out.println("Vypis vypis");
        }

    };
        // pomoci Lambda vyrazu
        Ilambda lamda2 =() -> System.out.println("Vypis vypis druhy");


    printit(lamda);
        printit(lamda2);
}
    public static void printit(Ilambda xxx){
        xxx.print();
    }

}
