package com.Testing.Test1.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    @GetMapping
    public static List<student> GetStudents(){
        return List.of(
                new student(
                        1L,
                        "George",
                        "george@gmail.com",
                        LocalDate.of(1994,4,23),
                        23


                )
        );

    }

}
