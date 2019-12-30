package com.heroku.herokube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public Message hi() {
        Message message = new Message("by Emrah & Emrullah & Sefa & Süleyman");
        return message;
    }
}
