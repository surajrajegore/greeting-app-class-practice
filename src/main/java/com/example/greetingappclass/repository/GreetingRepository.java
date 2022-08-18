package com.example.greetingappclass.repository;


import com.example.greetingappclass.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
