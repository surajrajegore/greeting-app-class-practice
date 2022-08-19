package com.example.greetingappclass.repository;


import com.example.greetingappclass.entity.Greeting;
import com.example.greetingappclass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
