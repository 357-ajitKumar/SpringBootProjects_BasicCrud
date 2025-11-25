package ajit.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/check")
    public String get(){

        return "Hello Mr.";
    }

    @GetMapping("/name")
    public String getName(){
        return "Ajit";
    }
}
