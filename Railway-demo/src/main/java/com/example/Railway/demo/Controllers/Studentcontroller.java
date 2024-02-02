package com.example.Railway.demo.Controllers;

import com.example.Railway.demo.Models.Student;
import com.example.Railway.demo.Repositories.Mongorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Studentcontroller {

    @Autowired
    public Mongorepo repo;

    @GetMapping("/students")
    public List<Student> getAll()
    {
//        List<Student> studs= Arrays.asList(new Student(10,"Abrar","209x1a05g2"),
//                new Student(11,"Abdul","209x1a05g1"));

        List<Student> all = repo.findAll();
        return all;

    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Student student)
    {
        repo.save(student);
        System.out.println(student);

        System.out.println(repo.findAll().size());

        return ResponseEntity.ok(student);
    }

    @GetMapping("/")
    public String default1()
    {
        return "No endpoint , Default Home page may be";
    }
}
