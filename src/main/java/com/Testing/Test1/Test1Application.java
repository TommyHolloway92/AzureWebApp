package com.Testing.Test1;

import com.Testing.Test1.Student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Test1Application {
	@GetMapping("/message")
	public String message(){
		return "API made to webpage womp womp";
	}
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}



}
