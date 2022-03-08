package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;


    @GetMapping("/calcucator")
    public String printCalculator(Model model){
/*
       Do parametrů zadáváme String, přes který bude objekt, "přepravka na data", v šabloně přístupný, např. "calculator".
       A do druhého parametru předáváme instanci naší třídy CalculatorForm s formulářem. */
    model.addAttribute("calc",new CalculatorForm());
    return "calculator";

       /* vracíme také nějaký String. V normálním @Controller je hodnota vrácená metodou název template (šablony), která
        má být vložena na vygenerovanou stránku.Šablony*/

    }
    @PostMapping("/calculator")
    public String handleCalculator(@ModelAttribute CalculatorForm calculator) {
        calculatorService.calculate(calculator);
        return "result";
    }
}
