package Fizz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MonTest {

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
}
