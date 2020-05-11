package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public Student getStudent(){
        return new Student(610541,"Andrew Walugembe");
    }
}
