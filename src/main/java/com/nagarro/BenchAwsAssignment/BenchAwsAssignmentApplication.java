package com.nagarro.BenchAwsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BenchAwsAssignmentApplication {

	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome to Docker assignment";
	}
	public static void main(String[] args) {

		SpringApplication.run(BenchAwsAssignmentApplication.class, args);
	}

}
