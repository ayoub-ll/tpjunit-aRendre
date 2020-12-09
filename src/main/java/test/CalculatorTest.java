package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import src.Calculator;

public class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	@Timeout(2000)
	@After
	public void CalculateSquareRootsTest() throws Exception {
		ArrayList<Double> expected = new ArrayList<Double>();
		
		expected.add((double) 1.0);
		expected.add((double) 1.41);
		expected.add((double) 1.73);
		expected.add((double) 2.0);
		expected.add((double) 2.23);
		
		assertEquals(expected, calculator.CalculateSquareRoots(1,5));
	}
	
	@Test
	@Timeout(2000)
	@Before
	public void CalculateSquareRootsWithUnorderedNumbersTest() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			calculator.CalculateSquareRoots(5,1);
	    });

	    String expectedMessage = "First parameter must be lower than second parameter !";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
