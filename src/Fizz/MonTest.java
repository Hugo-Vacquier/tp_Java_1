package Fizz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MonTest {

	@Test
	public void test() {
		int a = 2;
		int b = 3;
		int resultat = a + b;
		Assert.assertEquals(5, resultat);
	}

}
