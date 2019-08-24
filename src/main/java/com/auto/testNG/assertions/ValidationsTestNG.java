package com.auto.testNG.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationsTestNG {
	

	@Test
	public void validate() {
		String expectedValue = "A"; // this data could be from xls or prop or txt file
		String actualValue = "A";
		System.out.println("Start Before assertEquals");
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println("End After assertEquals");

		System.out.println("Start Before assertTrue");
		Assert.assertTrue(true, "asserting failed - Error");// if the second parameter ie., 4>2 returns true then it pass the TC
		System.out.println("End After assertTrue");

//		System.out.println("Start Before assertFalse");
//		Assert.assertFalse("ErrorMessageToPrint",4>2);// if the second parameter ie., 4>2 returns true then it fails the TC
//		System.out.println("End After assertFalse");

//		System.out.println("Start Before Fail");
//		Assert.fail("Had to be logged in but not logged in"); //this directly fails the TC
//		System.out.println("End After Fail");
		
		
}
}
