package cerma.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainScan {
        //vypis ze souboru po slovech
        public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }

//        scanner.useDelimiter(",");// nastaveni jineho oddelovace tokenu nez mezera
          //  if(scanner.hasNextInt()) {
               // int i = scanner.nextInt();
              //  System.out.println(i);
           // }

        }
    }

