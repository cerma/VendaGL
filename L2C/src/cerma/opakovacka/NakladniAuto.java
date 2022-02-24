package cerma.opakovacka;

public class NakladniAuto extends Auto implements Idoprava {
    private int nosnost;

    public NakladniAuto(String značka, String model, int rokVyroby,int nosnost) {
        super(značka, model, rokVyroby);
        this.nosnost = nosnost;
    }
}
