package cerma.Generika;

public class Pes {
    private String jmeno;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }



    public Pes(String jmeno){
        this.jmeno = jmeno;

    }
    public void stekej(){
        System.out.println("Haf haf");

    }



    @Override
    public String toString() {
        return "Pes{" +
                "jmeno='" + jmeno + '\'' +
                '}';
    }
}
