package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/calcucator")
    public String printCalculator(Model model){
/*
       Do parametrů zadáváme String, přes který bude objekt, "přepravka na data", v šabloně přístupný, např. "calculator".
       A do druhého parametru předáváme instanci naší třídy CalculatorForm s formulářem. */
    model.addAttribute("calculator",new CalculatorForm());
    return "calculator";

       /* vracíme také nějaký String. V normálním @Controller je hodnota vrácená metodou název template (šablony), která
        má být vložena na vygenerovanou stránku.Šablony*/

    }
}
