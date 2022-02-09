package cerma.Soubory;

public class Varargs {
    public static void main(String[] args) {
        int max = max("sadfa",1,2,3,10,0,15,17,100,1597,-4567);
    }
    private static int max(String s, int... values)//3 tecky jsou 0 - nekonecno parametru vstupnich
    {
        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }


}
