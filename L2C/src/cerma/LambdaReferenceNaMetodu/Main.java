package cerma.LambdaReferenceNaMetodu;

public class Main {
    public static void main(String[] args) {
        vypis(5, x -> System.out.println(x));

    }
    public static void vypis(int i,Interface inter){
        inter.process(i);
    }

}
