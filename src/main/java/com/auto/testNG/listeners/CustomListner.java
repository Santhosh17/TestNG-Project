package com.auto.testNG.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListner extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("** TC Failed TC Name = "+tr.getName() +" **");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("** TC Skipped TC Name = "+tr.getName()+" **");

	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("** TC Success TC Name = "+tr.getName()+" **");

	}
}
