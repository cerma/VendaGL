package cerma.LambdaFunkcionalniRozhrani;

import cerma.Lambda4.Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mesta = new ArrayList<>();



        mesta.add("Banská Bystrica");
        mesta.add("Prešov");
        mesta.add(null);
        mesta.add("Banská Šťavnica");
        mesta.add("Liptovský Trnovec");


        //setrizeni mest

      //  Collections.sort(mesta,(s1, s2)->s1.compareTo(s2) );

        //  printMesta(mesta);

        // printKratkeMesta(mesta);

        //osetreni vyjimky na fci toUpperCase
        printWithFilter(mesta,s -> true,wrapper(s-> System.out.println(s)),odchyceniVyjimky(s->s.toUpperCase()));


          /*try { Takhle by to slo ale je to skarede
            s=  s.toUpperCase();
          } catch (Exception e) {
           //   e.printStackTrace();
          }

        return s;
        });// vrati vsechny mesta
*/

        System.out.println("----------------------");

        // Lambda
       /* printWithFilter(mesta,(filter)-> !filter.contains(" "),s-> System.out.println(s),s->s.toLowerCase()  );
        System.out.println("----------------------");

        printWithFilter(mesta,(filter)->filter.startsWith("B"),s-> System.out.println(s),s -> s.replaceAll(" ","*") );*/

    }


    // vypis serazenych mest
    private static void printMesta(ArrayList<String> mesta) {
        for (String mesto : mesta){
            System.out.println(mesto);
        }
    }
    // vypis jen jednoslovnych mest

    private static void printKratkeMesta(ArrayList<String> mesta) {
        for (String mesto : mesta){
            if (!mesto.contains(" ")){
                System.out.println(mesto);
            }

        }
    }//Function ma dva parametry/ vstupni a vystupni
    private static void printWithFilter(List<String> mesta, Predicate<String> filter, Consumer<String> vypis, Function<String,String> funkce) //pouziti java.util.function.Predicate; rozhrani
    {
        for (String mesto : mesta){
            if (filter.test(mesto)){
                vypis.accept(funkce.apply(mesto));

            }

        }

    }
    private static Function<String,String> odchyceniVyjimky(Function<String,String> funkce){

        return s ->{ try {
         s=   funkce.apply(s);
        }
        catch (Exception e){
          System.err.println("Error v prevodu na UpperCase");
        }
        return s;
        };
    }
    private static <T>Consumer<T> wrapper(Consumer<T> vypis){
        return s ->{ try {
              vypis.accept(s);
        }
        catch (Exception e){
            System.err.println("Error");
        }

        };

    }


}
