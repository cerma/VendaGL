package cerma.cisla;

public class Cisla{
    public static void main(String[] args) {
data();
    }
    public static void data(){
        Byte b = 127;

        int i = b.intValue();//pretypovani na int
        System.out.println(i);

        String decimal = "2.5";
        double d = Double.parseDouble(decimal);//parsovani ze String na double
        System.out.println(d);

        String decimal1 = "2.5a";
        try {
            double d1 = Double.parseDouble(decimal1);//zachyceni vyjimky
        } catch (NumberFormatException e) {
            e.printStackTrace();//trasovani chyby
        }

        System.out.println(d);

    }

}
