package com.auto.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {
	// Step 1. make 2 dimentional object array and fill with data
	// Step 2. link the TC with the data (dataprovider location)
	// Step 3 (VIP). No of input parameters inside the method/function should be equal to no of parameters in the TC

	@Test(dataProvider = "getData") // Step 2
	public void doLoginTest(String un, String pw, String browser, String expresult) { // Step 3
		System.out.println("username = "+un);
	}

	@DataProvider(parallel = true)
	public Object[][] getData() { // Step 1
		Object[][] data = new Object[3][4];
		// 1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Chrome";
		data[0][3] = "pass";
		// 2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "Chrome";
		data[1][3] = "fail";
		// 3rd row
		data[2][0] = "U3";
		data[2][1] = "P3";
		data[2][2] = "Chrome";
		data[2][3] = "pass";
		
		return data;
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
}
