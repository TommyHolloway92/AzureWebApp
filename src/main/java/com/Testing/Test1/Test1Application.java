package com.Testing.Test1;

import com.Testing.Test1.Student.StudentRepo;
import com.Testing.Test1.Student.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class Test1Application {
	@GetMapping("/message")
	public String message(){
		return "API made to webpage womp womp";
	}

	@Autowired
	private StudentRepo repo;

	@PostMapping("/addStudent")
	public student addStudent(@RequestBody student student){
		return repo.save(student);

	}
	@GetMapping("/ReturnAll")
	public List<student> getStudent(){
		return repo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}



}
