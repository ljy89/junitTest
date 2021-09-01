package Junit.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void test() {
		String str = "JUnit is working fine.";
		
		assertEquals("JUnit is working fine.", str);
	}
	
}
