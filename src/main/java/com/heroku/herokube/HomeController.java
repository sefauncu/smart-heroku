package com.heroku.herokube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

//    @Autowired
//    private HomeService homeService;

    @GetMapping("/home")
    public Message hi() {
        Message message = new Message("by sefauncu");
//        homeService.save(message);
        return message;
    }

//    @GetMapping("/list")
//    public List<Message> findAll() {
//        List<Message> messages = homeService.findAll();
//        return messages;
//    }
}
