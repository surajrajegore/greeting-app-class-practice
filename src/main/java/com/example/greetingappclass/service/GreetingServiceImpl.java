package com.example.greetingappclass.service;

import com.example.greetingappclass.entity.Greeting;
import com.example.greetingappclass.entity.User;
import com.example.greetingappclass.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Autowired
    private GreetingRepository greetingRepository;
    private static final String template = "Hello , %s!";
    private final AtomicLong counter = new AtomicLong();
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,"Hello World");
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),
                (user.toString().isEmpty()) ? "Hello World" : user.toString()));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }

}
