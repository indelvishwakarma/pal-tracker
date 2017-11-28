package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController{
    private String WELCOME_MESSAG;

    public WelcomeController( @Value("${WELCOME_MESSAGE}") String msg){
        this.WELCOME_MESSAG = msg;
    }
    @GetMapping("/")
    public String sayHello() {
        return WELCOME_MESSAG;
    }
}