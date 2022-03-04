package spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FirstController {
    public Random random = new Random();

    @GetMapping("/random")
    public int generateRandomNumber(){

        return random.nextInt();
    }
    @GetMapping("/test")
    public String pozdrav(){
        return "Ahoj Tome";
    }
    @GetMapping("/vitej/{name}")
    public String pozdrav2 (@PathVariable String name)//PathVariable vezme jako vstupni parametr name z URL
    {
        return "Vitej " + name;
    }

}
