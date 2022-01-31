package cerma.Znaky;

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        char[] pole = {'a','b','c'};

        Character ch = 'b'; // objektovy char
// metody tridy Character
        System.out.println("char "+ch);
       System.out.println("isLetter "+Character.isLetter(ch));
        System.out.println("isDigit "+Character.isDigit(ch));
       System.out.println("isWhitespace "+Character.isWhitespace(ch));
        System.out.println("isUpperCase "+Character.isUpperCase(ch));
       System.out.println("isLowerCase "+Character.isLowerCase(ch));
        System.out.println("toUpperCase "+Character.toUpperCase(ch));
        System.out.println("toLowerCase "+Character.toLowerCase(ch));
        System.out.println("toString "+Character.toString(ch));
       System.out.println();


        System.out.println("Some \t nice text. tab");
        System.out.println("Some \t\b nice text. backspace");
        System.out.println("Some \n nice text. new line");

        //je to nieco ako na starom pĂ­sacom stroji kedy si sa presunul na zaciatok riadku
        //ak nedĂˇĹˇ ale novĂ˝ riadok, tak ti prepĂ­Ĺˇe to ÄŤo tam uĹľ mĂˇĹˇ napĂ­sanĂ©
        System.out.println("Some \r nice text. carriage return");
        System.out.println("Some \r\n nice text. carriage return a new line");
        System.out.println("Some \' nice text. ");
//        char uvodzovka = '''; //error
        char uvodzovka = '\'';
//        System.out.println("Some " nice text."); //error
        System.out.println("Some \" nice text.");
//        System.out.println("Some \ nice text."); //error
        System.out.println("Some \\ nice text.");
    }
}
