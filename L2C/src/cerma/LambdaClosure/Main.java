package cerma.LambdaClosure;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // tahle bez lambdy
       /* AddToInt(a, new Interface() {
            @Override
            public void process(int i) {
                //b++; tohle by neslo ve vnitrni tride nelze menit konstanty v nadrazene tride
                System.out.println(i+b);
            }
        });*/
        // s Lambdou
        AddToInt(a,i -> System.out.println(i+b));

    }
    public static void AddToInt(int i,Interface interfac){
        interfac.process(i);

    }
}
