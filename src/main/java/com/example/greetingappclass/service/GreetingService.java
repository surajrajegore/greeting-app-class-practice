package com.example.greetingappclass.service;

import com.example.greetingappclass.entity.Greeting;
import com.example.greetingappclass.entity.User;

public interface GreetingService {
    Greeting addGreeting(User user);
}
