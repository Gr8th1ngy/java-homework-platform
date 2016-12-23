package com.cofffeeshop;

public class CoffeeMachine {
	
	private int beansInStock=0;
	private int milkInStock=0;
	
	public Coffee drew(CoffType type, int quantity){
		
		requiredPostive(quantity);
		
		int requiredBean = type.getRequiredBeans()*quantity;
		int requirdMilk = type.getRequiredMilk()*quantity;
		
		if(requirdMilk>milkInStock || requiredBean>beansInStock){
			throw new IllegalArgumentException("Insufficent Milk and Beans");
		}
		
		beansInStock-=requiredBean;
		milkInStock-=requirdMilk;
		
		return new Coffee(type,requirdMilk,requiredBean);
	}

	private void requiredPostive(int quantity) {
		if(quantity<0){
			throw new IllegalStateException();
		}
		
	}

	public void restockBeans(int weighInGrams) {
		beansInStock+=weighInGrams;
	}

	public void restockMilk(int weighInGrams) {
		milkInStock+=weighInGrams;
		
	}



}
