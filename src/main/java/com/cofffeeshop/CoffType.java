package com.cofffeeshop;

public enum CoffType {
	Espresso(30,0),
	Latte(60,302),
	Mocha(60,30),
	Cappucino(90,120),
	Americano(60,0);
	int beans;
	int milk;
	private CoffType(int beans,int milk){
		this.beans=beans;
		this.milk=milk;
	}
	public int getRequiredBeans() {
		return beans;
	}
	public void setBeans(int beans) {
		this.beans = beans;
	}
	public int getRequiredMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	}
