package com.example.greetingappclass.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
public class User   {

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}
