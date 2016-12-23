package com.cofffeeshop;

public class Coffee {
	
	private CoffType coffeeType;
	private int milk;
	private int beans;

	public Coffee(CoffType coffeeType, int milk, int beans) {
		this.coffeeType = coffeeType;
		this.milk = milk;
		this.beans = beans;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public CoffType getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(CoffType coffeeType) {
		this.coffeeType = coffeeType;
	}

	public int getBeans() {
		return beans;
	}

	public void setBeans(int beans) {
		this.beans = beans;
	}
}
