package com.Testing.Test1.Student;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = new StudentService();
    }
    @GetMapping
    public List<student> GetStudents(){
       return StudentService.GetStudents();

    }
}
