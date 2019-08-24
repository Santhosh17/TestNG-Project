package com.auto.testNG.DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC {

	
//	public int xyz() {
//		
//	}
//	@Test
//	public void T()
//	{
//		System.out.println();
//	}
//	@Test (priority = 1,dataProviderClass = DP.class,dataProvider = "regTestDataProvider")
//	public void Test(String a, String b, String c, String d) {
//		System.out.println(a+" "+b+" "+c+" "+d);
//	}
	
	
	// passing same dataprovider for 2 different methods/tests
	// Multiple tests - same data - same dataprovider
//	@Test (priority = 2,dataProviderClass = DP.class,dataProvider = "sampleProvider")
//	public void Doll(String a, String b, String c, String d) {
//		System.out.println(a+" "+b+" "+c+" "+d);
//	}
//	@Test (priority = 3,dataProviderClass = DP.class,dataProvider = "sampleProvider")
//	public void Cat(String a, String b, String c, String d) {
//		System.out.println(a+" "+b+" "+c+" "+d);
//	}
//	
	// passing different dataprovider for 2 different methods/tests as parameters
	// Multiple tests - different data - same dataprovider
	@Test (dataProviderClass = DP.class, dataProvider = "sampleMultiDataProvider" )
	public void multiTestA(String a, String b) {
		System.out.println(a+" "+b);
	}
	@Test (dataProviderClass = DP.class, dataProvider = "sampleMultiDataProvider" )
	public void multiTestB(String a, String b, String c) {
		System.out.println(a+" "+b+" "+c);
	}
//	
//	
}
