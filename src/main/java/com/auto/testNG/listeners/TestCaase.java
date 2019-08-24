package com.auto.testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaase {
	@Test(priority =1)
	public void login() {
		System.out.println("running login");
		Assert.assertTrue(false);
		System.out.println("finished login");

	}
	@Test(priority =2)
	public void adminlogin() {
		System.out.println("running adminlogin");
		Assert.assertTrue(true);
		System.out.println("finished adminloginlogin");

	}
}
