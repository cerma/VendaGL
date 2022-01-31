package cerma.CislaUkol;

public class cislaUkol {
    public static void main(String[] args) {
    Data(10);
    Data(20.3);
    }
    public static void Data(Number n){
    //zjisteni jestli je instance typu Integer
        if(n instanceof Integer){
           int i= n.intValue() *10;
           System.out.println(i);
        }
        //zjisteni jestli je instance typu Double
        else if (n instanceof Double){
            double d = n.doubleValue() *10;
            System.out.println(d);
        }

    }
}
