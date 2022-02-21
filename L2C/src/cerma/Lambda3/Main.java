package cerma.Lambda3;


import cerma.LambdaVnitrniTridy.Ilambda;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ILamba nasob = a -> a*5;
        print(nasob);

    }
    public static void print(ILamba lambda){
        System.out.println(lambda.nasob(10));

    }

}
