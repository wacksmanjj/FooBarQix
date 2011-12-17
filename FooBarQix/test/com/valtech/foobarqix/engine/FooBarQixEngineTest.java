package com.valtech.foobarqix.engine;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooBarQixEngineTest {
	private final static Integer[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
															 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
															 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
															 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
															 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
															 50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
															 60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
															 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
															 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
															 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
	
	@Test
	public void testEngineFasterThanSimplestMethod() {
		long t1 = System.currentTimeMillis();
		new FooBarQixEngine().compute(numbers);
		t1 = System.currentTimeMillis() - t1;
		
		long t2 = System.currentTimeMillis();
		FooBarQixEngine.computeSimpleParallel(numbers);
		t2 = System.currentTimeMillis() - t2;
		
		long t3 = System.currentTimeMillis();
		FooBarQixEngine.computeSimple(numbers);
		t3 = System.currentTimeMillis() - t3;
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
		assertTrue(t1 < t2);
	}
}
