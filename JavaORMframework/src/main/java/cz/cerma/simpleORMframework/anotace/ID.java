package cz.cerma.simpleORMframework.anotace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// to znamena,ze bude dostupna za behu programu
@Target(ElementType.FIELD)

public @interface ID {
//zadna hodnota
}
