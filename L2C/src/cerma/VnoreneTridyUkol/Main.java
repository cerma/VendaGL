package cerma.VnoreneTridyUkol;

public class Main {
    public static void main(String[] args) {
        Clovek tomas = new Clovek(35,"Tomas");

        Clovek.BydlisteCloveka hustenovice = tomas.new BydlisteCloveka("Hustenovice 156");//pristup ke vnorene tride

        Clovek.StatickaPSC psc = new Clovek.StatickaPSC(68703); //pristup ke staticke tride

    }
}
