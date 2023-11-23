package Fizz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MonTest {

	//Test FizzBuzz normale
	@Test
	public void test() {
		Assert.assertEquals(FizzBuzz.fizzBuzz(1), "1");
	}
	
	@Test 
	public void test1() {
		Assert.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz");
	}
	
	@Test 
	public void test2() {
		Assert.assertEquals(FizzBuzz.fizzBuzz(95), "Buzz");
	}
	
	@Test 
	public void test3() {
		Assert.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
	}
	
	//Test FizzBuzz amélioré
	@Test
	public void test4() {
		Assert.assertEquals(FizzBuzz.fizzBuzz2(15), "FizzBuzz");
	}
	
	@Test
	public void test5() {
	        String expectedOutput = 
	        "1\n" +
	        "2\n" +
	        "Fizz\n" +
	        "4\n" +
	        "Buzz\n" +
	        "Fizz\n" +
	        "7\n" +
	        "8\n" +
	        "Fizz\n" +
	        "Buzz\n" +
	        "11\n" +
	        "Fizz\n" +
	        "13\n" +
	        "14\n" +
	         "FizzBuzz\n"; // Exemple pour num = 15

	        assertEquals(expectedOutput, FizzBuzz.fizzBuzz(15));
	    
	}
}
