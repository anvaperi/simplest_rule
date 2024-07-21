// src/main/java/com/example/age_restricted/Controller.java
package com.example.age_restricted;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/age")
    public Entity handleBoolean(@RequestParam boolean value) {
        return new Service(value).validate();
    }
}