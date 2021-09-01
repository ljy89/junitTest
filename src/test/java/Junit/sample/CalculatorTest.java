package Junit.sample;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.biz.Calculator;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		
		assertEquals("Calculator add", 5, calc.sum(2, 3)); //calc.sum(2,3)에 예상 결과5
		assertEquals("Calculator multiply",6, calc.multiply(2, 3));
		
	}

}
