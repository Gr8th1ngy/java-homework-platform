package com.coffeeshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cofffeeshop.Calculator;

public class CalTest {

	@Test
	public void canAddTest() {
		Calculator cal = new Calculator();

		int result = cal.add(1, 2);

		assertEquals(3, result);
	}

	@Test
	public void canSubTest() {
		Calculator cal = new Calculator();

		int result = cal.sub(3, 1);

		assertEquals(2, result);

	}

}
