package com.cerma;

public class NameTooLongException extends RuntimeException// nemusi se osetrovat, ale program potom spadne
{
    public NameTooLongException(String message){
        super(message);


    }
}
