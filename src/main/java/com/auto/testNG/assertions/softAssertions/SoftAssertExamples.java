package com.auto.testNG.assertions.softAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExamples {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void search() {
		// critical failure : Stop/Failure - we use Assert
		// Not Critical : Failure - Continue - we use softAssert
		System.out.println("Before Soft Assert");
//		Assert.fail();// normal assert
		softAssert.assertEquals("A", "B"); //fail
		softAssert.assertEquals("A", "A"); //pass
		softAssert.assertEquals("X", "H"); //fail
		softAssert.assertEquals("E", "B"); //fail
		System.out.println("After Soft Assert");
		softAssert.assertAll();// this line should be put at the end in order to execute all the above lines of code even if it failed
	}
	
	@Test
	public void addToBag() {
		// critical failure : Stop/Failure - we use Assert
		// Not Critical : Failure - Continue - we use softAssert
		System.out.println("Before Soft Assert");
//		Assert.fail();// normal assert
		softAssert.assertEquals("A", "B"); //fail
		softAssert.assertEquals("A", "A"); //pass
		softAssert.assertEquals("X", "H"); //fail
		softAssert.assertEquals("E", "B"); //fail
		System.out.println("After Soft Assert");
		softAssert.assertAll();// this line should be put at the end in order to execute all the above lines of code even if it failed
	}
}