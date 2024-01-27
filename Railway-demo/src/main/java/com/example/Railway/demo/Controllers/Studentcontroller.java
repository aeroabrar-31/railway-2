package com.example.Railway.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {

    @GetMapping("/students")
    public String getAll()
    {
        return "Hello All Students !";
    }

    @GetMapping("/")
    public String default1()
    {
        return "No endpoint , Default Home page may be";
    }
}
