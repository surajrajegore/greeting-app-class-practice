package com.example.greetingappclass.service;

import com.example.greetingappclass.entity.Greeting;
import com.example.greetingappclass.entity.User;

import java.util.List;
import java.util.Optional;

public interface GreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAllUser();
    Optional<Greeting> updateGreeting(Greeting greeting, Long id);


}
