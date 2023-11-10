package com.crud.demo.rest;

import com.crud.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> student;

    @PostConstruct
    public void loadData() {
        student=new ArrayList<>();

        student.add(new Student("Mouni","Naidu"));
        student.add(new Student("Leena","Naidu"));
        student.add(new Student("Sai","Naidu"));

    }

    @GetMapping("/students")
    public List<Student> getStudent() {

        return student;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        return student.get(studentId);
    }
}
