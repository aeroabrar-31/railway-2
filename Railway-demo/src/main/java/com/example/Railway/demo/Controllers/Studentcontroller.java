package com.example.Railway.demo.Controllers;

import com.example.Railway.demo.Models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Studentcontroller {

    @GetMapping("/students")
    public List<Student> getAll()
    {
        List<Student> studs= Arrays.asList(new Student(10,"Abrar","209x1a05g2"),
                new Student(11,"Abdul","209x1a05g1"));
        return studs;

    }

    @GetMapping("/")
    public String default1()
    {
        return "No endpoint , Default Home page may be";
    }
}
