package Spring.Controllers;

import Spring.Model.Hodnoty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

@GetMapping()
    public String uvod(@ModelAttribute Hodnoty hodnota){


    return "Uvod";

}
}
