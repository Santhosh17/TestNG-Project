package com.auto.testNG.DataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DP {
	@DataProvider (name = "regTestDataProvider")
	public static Object[][] getData() { 
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
	// passing same dataprovider for 2 different methods/tests
	// Multiple tests - same data - same dataprovider
	@DataProvider (name = "sampleProvider")
	public static Object[][] sampleProvider() { 
		Object[][] data = new Object[3][4];
		// 1st row
		data[0][0] = "DU1";
		data[0][1] = "DP1";
		data[0][2] = "DChrome";
		data[0][3] = "Dpass";
		// 2nd row
		data[1][0] = "DU2";
		data[1][1] = "DP2";
		data[1][2] = "DChrome";
		data[1][3] = "Dfail";
		// 3rd row
		data[2][0] = "DU3";
		data[2][1] = "DP3";
		data[2][2] = "DChrome";
		data[2][3] = "Dpass";
		
		return data;
	}
	// passing different dataprovider for 2 different methods/tests as parameters
	// Multiple tests - different data - same dataprovider
	@DataProvider (name = "sampleMultiDataProvider")
	public static Object[][] sampleMultiDataProvider(Method m) { 
		Object[][] data=null; 
		
		if(m.getName().equals("multiTestA")) {
			data = new Object[2][2];
			// 1st row
			data[0][0] = "M1U1";
			data[0][1] = "M1P1";
			
			// 2nd row
			data[1][0] = "M1U2";
			data[1][1] = "M1P2";
		}else if(m.getName().equals("multiTestB")) {
			data = new Object[2][3];
			// 1st row
			data[0][0] = "DU1";
			data[0][1] = "DP1";
			data[0][2] = "DChrome";
			
			// 2nd row
			data[1][0] = "DU2";
			data[1][1] = "DP2";
			data[1][2] = "DChrome";
			
			
		}
		
		
		return data;
	}
}
