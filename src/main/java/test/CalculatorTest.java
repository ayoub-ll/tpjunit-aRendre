package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import src.Calculator;

public class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	public void CalculateSquareRootsTest() throws Exception {
		ArrayList<Double> expected = new ArrayList<Double>();
		
		expected.add((double) 1);
		expected.add((double) 2.41);
		expected.add((double) 1.73);
		expected.add((double) 2);
		expected.add((double) 2.24);
		
		
		ArrayList<Double> result = calculator.CalculateSquareRoots(1,5);
		
		assertEquals(expected, result);
	}
}
