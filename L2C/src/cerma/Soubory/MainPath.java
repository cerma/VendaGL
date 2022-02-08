package cerma.Soubory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainPath {
    public static void main(String[] args) throws IOException {
        Path path;
        path = Paths.get("C:\\FS\\users.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        try (Scanner scanner = new Scanner(Files.newBufferedReader(path))) //buffer implementuje closable, nemusi se soubor uz zavirat
        {
            System.out.println( scanner.nextLine()); // vypise prvni radek neni cyklus

        }
        catch (IOException e){
        e.printStackTrace();
        e.getMessage();

        }
    }
}
