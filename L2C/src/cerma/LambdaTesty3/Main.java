package cerma.LambdaTesty3;

public class Main {
    public static void main(String[] args) {

        Main objekt = new Main();

     int j =  objekt.vypocet(5, i -> i*5);

    }

    public int vypocet(int i,InterfaceLambda lambda){
       return lambda.kalk(i);


    }
}
