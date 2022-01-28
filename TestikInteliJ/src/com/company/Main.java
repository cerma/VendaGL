package com.company;

public class Main {

    public static void main(String[] args) {

        Data test = new Data();
        test.setCislo(15);
        test.setJmeno("Tomas");

        System.out.println(test.getJmeno()+ " "+test.getCislo());


    }
}
