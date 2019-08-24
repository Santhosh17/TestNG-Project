package com.auto.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SearchAndBuyTestWithPriorityAndValidationAndDependencyBeforeAfterAnnotations {

	@AfterClass
	public void afterClass() {
		System.out.println("Running AfterClass Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running AfterMethod Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Running AfterTest Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Running AfterSuite Method");
	}
	@Test(priority = 1)
	public void search() {
		System.out.println("Searching Item...");
//		Assert.assertTrue(false, "assertionError");
//		throw new SkipException("Any Reason");
	}

	@Test(priority = 2, dependsOnMethods = ("search")) // dependsOnMethod output depends on the result of search method
	public void addToCart() {
		System.out.println("Adding Item to Cart...");
	}

	@Test(priority = 3, dependsOnMethods = ("addToCart"))
	public void makePayment() {
		System.out.println("Making Payments to items in Cart...");
	}

	@Test(priority = 4)
	public void checkoutCart() {
		System.out.println("Checkout items ...");
	}

	@Test(priority = 5)
	public void goingToParkingLot() {
		System.out.println("Going to parkingLot ...");
	}

	@Test(priority = 6)
	public void drivingHome() {
		System.out.println("Driving Home...");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running BeforeClass Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running  BeforeTest Method ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running BeforeMethod Method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running BeforeSuite Method");
	}

}