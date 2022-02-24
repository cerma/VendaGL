package cerma.AnotaceUvod;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)//udava kdy je tato anotace dostupna - class znamena ze jen pri psani kodu
@Documented // to znamena ze tato anotace bude obsazena v dokumentaci
public @interface Author {

String name();
String date();
String company() default "cerma s.r.o.";// kdyz je default tak nemusi byt vzplnena ve tride
    int vek();



}
