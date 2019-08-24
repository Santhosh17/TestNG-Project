package com.auto.testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAndBuyTestWithPriorityAndValidationAndDependency {
	@Test(priority = 1)
	public void search() {
		System.out.println("Searching Item...");
		Assert.assertTrue(false,"assertionErrrrrrrror");
	}
	
	@Test (priority = 2)// dependsOnMethod output depends on the result of search method
	public void addToCart() {
		System.out.println("Adding Item to Cart...");
	}
	
	@Test (priority = 3,dependsOnMethods =("addToCart"))
	public void makePayment() {
		System.out.println("Making Payments to items in Cart...");
	}
	
	@Test (priority = 4)
	public void checkoutCart() {
		System.out.println("Checkout items ...");
	}
}