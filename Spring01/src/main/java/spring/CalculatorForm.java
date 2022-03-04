package spring;

import lombok.Data;

@Data // je z Lomboku a generuje Geterz a Setery
public class CalculatorForm {
    private int number1;
    private String operation;
    private int number2;
    private int result;
}
