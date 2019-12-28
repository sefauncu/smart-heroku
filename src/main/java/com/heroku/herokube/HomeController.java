package com.heroku.herokube;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    @CrossOrigin(origins = "http://localhost:4200")
    public String hi(){
        return "Hello Smart Heroku";
    }
}
