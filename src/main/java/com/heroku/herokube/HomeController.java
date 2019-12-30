package com.heroku.herokube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public Employee hi() {
        Employee employee = new Employee("ES","ES");
        return employee;
    }
}
