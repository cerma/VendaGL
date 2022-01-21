/*
 *  Licence Tomas Cermak
 * 
 */
package genericita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author cermak
 */
public abstract class Genericita implements Comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //datovy typ pro T - Data bude integer
        Data<Integer> trida = new Data<>(15);

        //LIST
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);

        System.out.println(list.get(0));

        //LINKED LIST
        // LinkedList neobsahuje rovnou naše prvky jako tomu bylo u ArrayListu, ale jsou v něm uloženy položky typu Node. Jsou to uzly, 
        //které na sebe navzájem ukazují (odkazují se, chcete-li) a disponují vlastností item. Právě v té je teprve uložen náš prvek,
        //který uzel obaluje. Dodává tak našemu prvku ony vazby na prvky okolní. Ukažme si metody, které má LinkedList oproti klasickému ArrayListu navíc:
        // inicializace a naplnění spojového seznamu
        LinkedList<Integer> seznam = new LinkedList<>();
        seznam.addLast(1);
        seznam.addLast(2);
        seznam.addLast(3);
        seznam.addLast(4);
        seznam.addLast(5);

// přidávání a mazání v prostředku seznamu
        seznam.add(3, 32);
        seznam.add(3, 31);
        seznam.remove(2);

// výpis seznamu
        for (Integer i : seznam) {
            System.out.print(i + ", ");
        }

        //HASH MAP
        Map<String, String> slovnik = new HashMap<>();

        slovnik.put("cat", "kočka");
        slovnik.put("mouse", "myš");
        slovnik.put("computer", "počítač");
        //zadat slovo 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadej slovo: ");
        String slovo = scanner.nextLine();
        //preklad ze slovniku
        if (slovnik.containsKey(slovo)) {
            System.out.println("Překlad: " + slovnik.get(slovo));
        } else {
            System.out.println("Takové slovíčko ve slovníku není.");
        }

    }

}
