package edu.karazin.lab1;

import org.springframework.stereotype.Component;

@Component
public class FactorialService {

	public long factorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Number must be non-negative");
		}
		long result = 1L;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}
}
