package cerma.VorenaAnonymniTrida;

public class AnonimniTrida {

    public static void main(String[] args) {
        AnonimniTrida util = new AnonimniTrida();
        util.vypisNakonzolu(new implementacniTrida());// jako vstupni parametr bude instance tridy ktera implementuje Irozhrani, toto nevypise nic
        //anonimni vnitrni trida, instance na irozhrani a prepise si metody, ktere jsou prazdne
        util.vypisNakonzolu(new Irozhrani() {
            @Override
            public void VypisSystemout() {
                System.out.println("Vypis z anonymni tridy");
            }

            @Override
            public void VypisErr() {
                System.err.println("Vypis err z anonymni tridy");
            }
        });
    }


    public void vypisNakonzolu(Irozhrani vypis)// prima jako vstupni parametr interface
    {
        vypis.VypisErr();
        vypis.VypisSystemout();
    }
}
