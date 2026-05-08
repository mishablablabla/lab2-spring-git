package edu.karazin.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab1ConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab1ConsoleApplication.class, args);
	}

	@Bean
	CommandLineRunner run(FactorialService factorialService) {
		return args -> {
			int value = 6;
			long result = factorialService.factorial(value);
<<<<<<< HEAD
			System.out.println("Hello from feature branch");
=======
			System.out.println("Version from MAIN branch");
>>>>>>> 3a9c37b (main branch change)
			System.out.println("Factorial(" + value + ") = " + result);
		};
	}
}
