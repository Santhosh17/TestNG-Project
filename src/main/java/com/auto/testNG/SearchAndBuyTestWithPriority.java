package com.auto.testNG;


import org.testng.annotations.Test;

public class SearchAndBuyTestWithPriority {
	@Test(priority = 1)
	public void search() {
		System.out.println("Searching Item...");
	}
	
	@Test (priority = 2)
	public void addToCart() {
		System.out.println("Adding Item to Cart...");
	}
	
	@Test (priority = 3)
	public void makePayment() {
		System.out.println("Making Payments to items in Cart...");
	}
	
	@Test (priority = 4)
	public void checkoutCart() {
		System.out.println("Checkout items ...");
	}
}