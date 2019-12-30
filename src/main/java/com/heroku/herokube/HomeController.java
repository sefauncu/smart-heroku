package com.heroku.herokube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String hi() {
        return "Hi Smart Heroku";
    }
}
