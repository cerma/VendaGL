/*
 *  Licence Tomas Cermak
 * 
 */
package com.cerma.demo;

/**
 *
 * @author cermak
 */
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private Random random = new Random();
    
    @GetMapping
    private int generateRandomnumber(){
    
       
    
    return random.nextInt();
    
    
    }
    @GetMapping("/pozdrav/{name}")
    private String Pozdrav(@PathVariable String name){
    
        return "Ahoj " + name;
    
    }
}
