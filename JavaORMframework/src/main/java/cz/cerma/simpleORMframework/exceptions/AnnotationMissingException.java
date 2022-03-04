package cz.cerma.simpleORMframework.exceptions;

public class AnnotationMissingException extends RuntimeException// runtime se nemusi osetrovat, ale program spadne
{
    public AnnotationMissingException(String message) {
        super(message);
    }
}
