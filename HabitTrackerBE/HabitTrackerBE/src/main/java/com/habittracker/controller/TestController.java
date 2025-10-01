package com.habittracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Collections;
import java.util.Map;

//@RestController
@CrossOrigin(origins = "http://localhost:3000") // allow frontend
public class TestController {

    //@GetMapping("/hello")
    public Map<String, String> hello() {
        return Collections.singletonMap("message", "Hello from Spring Boot!");
    }
}
