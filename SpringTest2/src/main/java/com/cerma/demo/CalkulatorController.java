/*
 *  Licence Tomas Cermak
 * 
 */
package com.cerma.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author cermak
 */
@Controller // @controller narozdil od @RestController umi pracovat s HTML sablonami 
public class CalkulatorController {
    
    @GetMapping("/calculator")
    public String PrintCalculator(Model model){
    model.addAttribute("calculator",new CalculatorForm()); //Do parametrů zadáváme String, přes který bude objekt,
    //"přepravka na data", v šabloně přístupný, např. "calculator". A do druhého parametru předáváme instanci naší třídy CalculatorForm s formulářem.
    
    return "calculator";
  
    }
    @PostMapping("/result")
    public String handleCalculator(@ModelAttribute CalculatorForm calculator){
        return "result";
    
    
    
    }
    
}
