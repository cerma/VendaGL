package cerma.VnoreneTridyUkol;

public class Clovek {
    private int Vek;
    private String Jmeno;

    public Clovek(int vek, String jmeno) {
        Vek = vek;
        Jmeno = jmeno;
    }

    public class BydlisteCloveka{
       private String bydliste;

        public BydlisteCloveka(String bydliste) {
            this.bydliste = bydliste;
        }
    }
    public static class StatickaPSC{
        private int PSC;

        public StatickaPSC(int PSC) {
            this.PSC = PSC;
        }
    }

}
