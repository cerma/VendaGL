package cerma.Lambda2;

public class Main {
    public static void main(String[] args) {


    Ilambda2 lambda =(int a,int b) -> {
    if (b==0){
    return 0;}
     else {return a/b;}
    };

    double d =lambda.vypocet(30,20);
        System.out.println(d);

    }
}
