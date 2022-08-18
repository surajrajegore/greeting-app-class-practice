package com.example.greetingappclass.controller;

import com.example.greetingappclass.entity.Greeting;
import com.example.greetingappclass.entity.User;
import com.example.greetingappclass.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetingController")
public class GreetingController {

    @Autowired
   private GreetingService greetingService;
//    private static final String template = "Hello , %s %s!";
  //  private final AtomicLong counter = new AtomicLong();
    @GetMapping
    public Greeting greetingMessage(@RequestParam(required = false,defaultValue = "") String firstName,@RequestParam(required = false,defaultValue = "") String lastName){
//
//        return new Greeting(counter.incrementAndGet(),String.format(template,firstName,lastName));

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);

    }
}
