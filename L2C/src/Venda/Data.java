package Venda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public Integer GLzaokrouhlene;
    public String[] pole;
    public String smajla;
    public String trend;

    public void vypocet() throws IOException {
        List hodnoty = new ArrayList();

        URL oracle = new URL("https://vendarulez.herokuapp.com/api/v1/entries");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            hodnoty.add(inputLine);


        String vysledek = hodnoty.get(0).toString();
        pole = vysledek.split("\t");



        double aktualniGL = Integer.parseInt(pole[2]);
        System.out.println(aktualniGL);

        double aktualniGLmmol = aktualniGL/18;
        GLzaokrouhlene = (int) Math.round(aktualniGLmmol);

        System.out.println(GLzaokrouhlene);
        System.out.println(hodnoty);

        System.out.println(pole[3]);
        trend = pole[3];
    }
    public void smajlik(){


        if (trend.contains("Down") && GLzaokrouhlene<7){
            smajla = "low";
        }
        else if ((trend.contains("Flat") && GLzaokrouhlene<7)||(trend.contains("down") && GLzaokrouhlene==6)){
            smajla = "medium";
        }
        /*else if (trend.equals("Down") && GLzaokrouhlene==7){
            smajla = "medium";
        }*/
        else if  ((GLzaokrouhlene<=9 && GLzaokrouhlene>=7) || trend.contains("Up"))  {
            smajla = "ok";

        }
        else
            smajla = "high";
    }
}
