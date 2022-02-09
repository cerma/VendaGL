package cerma.SouboryUkol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }      }

        }

