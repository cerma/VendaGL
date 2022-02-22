package cerma.LambdaVsVnitrniTrida;

public class Main {
    public void CallInterface(int i,Interface inter){
        inter.process(i);
    }

    public static void main(String[] args) {
        Main objekt = new Main();
        // bez Lambdy
        objekt.CallInterface(5, new Interface() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);//odkazuje se na instanci new Interface();
            }

            @Override
            public String toString() {
                return "sme v Interface";
            }
        });

        objekt.CallInterface(5,i -> {System.out.println(i);
      // System.out.println(this);}); tohle by neslo odkazuje se az na metodu main
        }); }
}
