package com.valtech.foobarqix.engine;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DigitProcessorTest {
	private final static int TESTED_DIGIT = 3;
	private final static String TESTED_NAME = "Foo";
	
	private static DigitProcessor digitProcessor;
	
	@Before
	public void setUp() {
		digitProcessor = new DigitProcessor(TESTED_DIGIT, TESTED_NAME);
	}

	@Test
	public void testAnyNumberWithNo3ReturnsNullMatchValue() {
		for(int i=1 ; i<=100 ; i++) {
			if((i%10) != TESTED_DIGIT && (i/10) != TESTED_DIGIT) {
				assertNull(digitProcessor.getMatch(i));
			}
		}
	}
	
	@Test
	public void testAnyNumberWithFirstDigitEqualTo3ReturnsMatchValueContainingFoo() {
		for(int i=0 ; i<10 ; i++) {
			assertTrue(digitProcessor.getMatch(TESTED_DIGIT + 10*i).contains(TESTED_NAME));
		}
	}
	
	@Test
	public void testAnyNumberWithSecondDigitEqualTo3ReturnsMatchValueContainingFoo() {
		for(int i=0 ; i<10 ; i++) {
			assertTrue(digitProcessor.getMatch(i + 10*TESTED_DIGIT).contains(TESTED_NAME));
		}
	}
	
	@Test
	public void testAnyNumberNotAMultipleOf3ReturnsNullMultValue() {
		for(int i=1 ; i<=100 ; i++) {
			if((i%TESTED_DIGIT) != 0) {
				assertNull(digitProcessor.getMult(i));
			}
		}
	}
	
	@Test
	public void testAnyNumberMultipleOf3ReturnMultValueEqualToFoo() {
		for(int i=1 ; i<=100 ; i++) {
			if((i%TESTED_DIGIT) == 0) {
				assertTrue(digitProcessor.getMult(i).equals(TESTED_NAME));
			}
		}
	}
}
