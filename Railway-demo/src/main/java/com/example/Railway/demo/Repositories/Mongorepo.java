package com.example.Railway.demo.Repositories;

import com.example.Railway.demo.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Mongorepo extends MongoRepository<Student,Integer> {

}
