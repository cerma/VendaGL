package cerma.opakovacka;

public class Auto implements Idoprava {
    private String značka;
    private String model;
    private int rokVyroby;

    public Auto(String značka, String model, int rokVyroby) {
        this.značka = značka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public String getZnačka() {
        return značka;
    }

    public void setZnačka(String značka) {
        this.značka = značka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "značka='" + značka + '\'' +
                ", model='" + model + '\'' +
                ", rokVyroby=" + rokVyroby +
                '}';
    }

    @Override
    public void prodej() {
        System.out.println("prodavam auto");
    }
}
