package Spring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

@GetMapping("/uvod")
    public String uvod(Model model){
   // model.addAttribute("uvod",new MainController());

    return "Uvod";

}
}
