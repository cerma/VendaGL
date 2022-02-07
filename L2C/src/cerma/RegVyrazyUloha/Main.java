package cerma.RegVyrazyUloha;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(  mailValid("cermak@cermak.com"));


    }

    public static boolean mailValid(String s){
        String reg="\\w+@\\w+.cz";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(s);

        if (m.find()){
            return true;

        }
        else
            return false;


    }
    private static boolean task02(String passwd) {
        if (passwd.length() < 8) {
            System.out.println("The password is short.");
            return false;
        }

        if (passwd.matches("\\D+")) {
            System.out.println("Password must contain a number.");
            return false;
        }

        if (passwd.matches("\\P{Upper}+")) {
            System.out.println("Password must contain a capital letter.");
            return false;
        }
        return true;
    }



    private static boolean task03(String picture) {
        String regex = "\\w+\\.(jpg|png|jpeg|bmp)";
        return picture.matches(regex);
    }


    private static boolean task04(String dateFormat) throws Exception {
        String regex = "^\\d{1,2}/\\d{1,2}/\\d{4}";

        Date date = new Date(dateFormat);

        if (dateFormat.matches(regex)){
            System.out.println("Correct date format.");
            return true;
        } else {
            System.out.println("Incorrect date format. Try dd/mm/yyyy");
            return false;
        }
    }

    private static void task05(String sText) {
        String regex = "[A-Z][a-z]+";
        boolean found = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sText);

        while (m.find()){
            System.out.println(m.group());
            found = true;
        }
    }


    private static void task06(String sText) {
        String regex = "\\d+";
        boolean found = false;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(sText);

        while (m.find()){
            System.out.println(m.group());
            found = true;
        }
    }



}
