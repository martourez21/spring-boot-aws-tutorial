package com.springbootawstutorial.controller;

import com.springbootawstutorial.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    Person person = new Person("Nestor", "Martourez", 30, "Cameroon");

    @GetMapping("/home")
    public String home() {
        return "welcome to the Person's platform";
    }

    @GetMapping("/greet")
    public String getPerson() {
        return "Hello, I am "+person.firstName()+ " "+person.lastName()+". Iam "+person.age()+"years old from "+person.country();
    }
}
