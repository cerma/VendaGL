package cerma.Soubory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class Manipulace {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\FS\\users.txt");


        System.out.println("Files.exists " + Files.exists(path));
       System.out.println("Files.notExists " + Files.notExists(path));

       System.out.println("Files.isReadable " + Files.isReadable(path));
        System.out.println("Files.isHidden " + Files.isHidden(path));
        System.out.println("Files.isDirectory " + Files.isDirectory(path));

        //        System.out.println(Files.isSameFile(path,path2));

//        Files.delete(path);
//        try {
//            Files.delete(path);
//        } catch (NoSuchFileException x) {
//            System.err.println("neexistujem danĂ˝ sĂşbor "+path);
//        } catch (DirectoryNotEmptyException x) {
//            System.err.println("priecinok nie je prazdny "+path);
//        } catch (IOException x) {
//            System.err.println(x);
//        }

//        System.out.println(Files.deleteIfExists(path2));

       // Files.copy(path,path2, StandardCopyOption.REPLACE_EXISTING);

    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
//
 System.out.println("creationTime: " + attr.creationTime());
   System.out.println("lastAccessTime: " + attr.lastAccessTime());
      System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

       System.out.println("isDirectory: " + attr.isDirectory());
       System.out.println("isOther: " + attr.isOther());
       System.out.println("isRegularFile: " + attr.isRegularFile());
       System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());

        System.out.println(Files.readAllLines(path));

    }
}
