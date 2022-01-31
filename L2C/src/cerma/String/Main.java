package cerma.String;

public class Main {
    public static void main(String[] args) {
        String s = "Tomas Cermak";
        System.out.println(s.length());
        System.out.println(s.charAt(10));
        System.out.println(s.substring(1,3));

        System.out.println("---------------");
        System.out.println(s.indexOf(' '));
        System.out.println(s.indexOf("Cermak"));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.contains("Cermak"));
        System.out.println(s.equals("tomas cermak"));
        System.out.println(s.equalsIgnoreCase("tomas cermak"));

        System.out.println("---------------------");
        System.out.println(s.replace("T","t"));
        System.out.println(s.replace('C','c'));
        System.out.println(s.replaceAll("a","A"));
        //regex budeme preberat neskor
        String text = "jaro ma 55 rokov 199 centimetrov";
        System.out.println(text.replaceAll("[0-9]","?"));

        String s5 = text.replaceFirst("[0-9]","?").toUpperCase();
        System.out.println(s5);
    }
}
