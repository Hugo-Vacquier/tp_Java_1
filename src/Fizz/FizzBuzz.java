package Fizz;

public class FizzBuzz {
	public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
	
	public static String fizzBuzz2(int num) {
		for (int i = 0; i<num; i++) {
			if (num % 3 == 0 && num % 5 == 0) {
	            return "FizzBuzz";
	        } else if (num % 3 == 0) {
	            return "Fizz";
	        } else if (num % 5 == 0) {
	            return "Buzz";
	        } else {
	            return Integer.toString(num);
	        } 
		}
		return "num";	
	}
}
