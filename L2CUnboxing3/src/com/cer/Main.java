package com.cer;

public class Main {

    public static void main(String[] args) {
        int a;
        Integer a2;//obalovaci trida int plati pro vsechnz datove typy, dela z primitivniho objektovy datovy typ
        long b;
        char c;
        byte d;
        short e;
        float h;
        String f;
        Boolean g2;//obalovaci trida boolean
        boolean g = true;

        //Integer i = new Integer(10);// neni treba takovy zapis
        Integer inte = 10; //objektovy int
        int i2 = inte; // unboxing datoveho typu
        test(g);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(10,20));

        String prevod = String.valueOf(i2);// prevod int na string

        System.out.println(prevod);

        String s2 = "15";
        int i22 = Integer.parseInt(s2);// parsovani z String na Int



    }



    private static void test(Object c){
        c.toString();


    }
}
