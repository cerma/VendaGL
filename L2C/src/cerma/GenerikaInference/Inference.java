package cerma.GenerikaInference;

import java.util.ArrayList;

public class Inference {
    public static <T> T pick(T t1,T t2){
       return t1;

    }

    public static void main(String[] args) {
            pick("d",new ArrayList<String>());//maji spolecneho predka rozhrani serrializable
    }
}
