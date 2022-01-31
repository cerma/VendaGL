package cerma.Cisla2;

public class Main {
    public static void main(String[] args) {
        //modulo();
randomNumbers();
    }
    private static void modulo(){
        for(int i =0;i<32;i++){
            rozdejHracoviKartu(i%4+1,i);


        }


    }
    private static void rozdejHracoviKartu(int hrac,int karta){
        System.out.println("Rozdavam hracovi "+ hrac+" Kartu "+karta);

    }
    private static void basicMathOperations() {
        //dalsie matematicke operacie a pomocky java.lang.Math
        System.out.println(Math.PI);


        double a = -191.635;
        double b = 43.24;
        int c = 16, d = 45;


        System.out.println("a "+a+" abs "+ Math.abs(a));

        System.out.println("b "+b+" ceil "+Math.ceil(b));

        System.out.println("b "+b+" floor "+Math.floor(b));

        System.out.println("b "+b+" rint "+Math.rint(b)); //klasicke zaokruhovanie zmen b ... vracia double hodnotu intu
        System.out.println("b "+b+" round "+Math.round(b)); //klasicke zaokruhovanie zmen b ... vracia int alebo long ... int round(float f)

        System.out.println("c "+c+" a d "+d+" max "+Math.max(c, d));

        System.out.println("c "+c+" a d "+d+" min "+Math.min(c, d));
    }

    private static void randomNumbers() {
        int number = (int)(Math.random() * 1000);  //Math.random() hodnota od 0.0 po 1.0  ... kratenim vies zvatsit .. pretypovanie na int
        System.out.println(number);
    }
}
