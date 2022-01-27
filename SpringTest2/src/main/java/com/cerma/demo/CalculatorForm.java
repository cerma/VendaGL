/*
 *  Licence Tomas Cermak
 * 
 */
package com.cerma.demo;

import lombok.Data;

/**
 *
 * @author cermak
 */
@Data // lombok automaticky generuje getery a setery ve tridach
public class CalculatorForm {
    private int number1;
    private int number2;
    private String operation;
    private int result;
        
    
    
}
