package cerma.generikaUkol;

public class GenTrida<P,T>  {
    private P vec;
    private T objekt;

    public T getObjekt() {
        return objekt;
    }

    public void setObjekt(T objekt) {
        this.objekt = objekt;
    }

    public P getVec() {
        return vec;
    }

    public void setVec(P vec) {
        this.vec = vec;
    }

    public static void main(String[] args) {
        GenTrida<String,Integer> test = new GenTrida<>();

        test.setVec("Toto je String");
        test.setObjekt(56);

        System.out.println(test.getVec()+" "+test.getObjekt());

    }




}
