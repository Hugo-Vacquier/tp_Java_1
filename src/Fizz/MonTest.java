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
		Assert.assertEquals(FizzBuzz.fizzBuzz(2), "2");
	}
}
