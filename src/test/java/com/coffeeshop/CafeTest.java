package com.coffeeshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cofffeeshop.CoffType;
import com.cofffeeshop.Coffee;
import com.cofffeeshop.CoffeeMachine;

public class CafeTest {

	private static final int NO_MILK = 0;

	@Test
	public void canDrewAmericano() {

		CoffeeMachine huyHouseCafe = new CoffeeMachine();
		huyHouseCafe.restockBeans(90);
		
		Coffee coffee = huyHouseCafe.drew(CoffType.Espresso, 3);
		
		
		assertEquals(0, coffee.getMilk());
		assertEquals(CoffType.Espresso, coffee.getCoffeeType());
		assertEquals(90, coffee.getBeans());

	}

}
