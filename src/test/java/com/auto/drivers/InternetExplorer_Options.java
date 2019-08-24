package com.auto.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class InternetExplorer_Options {
			// pre requisites - Be careful with IE version 11 ensure to have correct driver to the IE version 
			// logs
			// binary - NO
			// profiling - NO
			// notifications - NO
			// certificate
			// page load strategy -NO
			// proxy
	@Test
	public void launchConfiguredInternetExplorer() {

		System.setProperty("webdriver.ie.driver", "C:\\Java Libraries\\drivers\\IEDriverServer.exe");

//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"INFO");
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"FATAL");
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY,"ERROR");
//		
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGFILE_PROPERTY,"null");// you can replace the null with the location where you want the log
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_SILENT_PROPERTY,"true");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		
//		options.setPageLoadStrategy(PageLoadStrategy.NONE); - this is not supported by IE
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		//Standard code to set the Proxy in IE.
//		String PROXY = "83.209.94.89:44557";
//		Proxy proxy = new Proxy();
//		proxy.setAutodetect(false);
//		proxy.setProxyType(Proxy.ProxyType.MANUAL);
//		proxy.setSocksProxy(PROXY);
//		cap.setCapability(CapabilityType.PROXY,proxy);
//		options.merge(cap);
		
		WebDriver driver = new InternetExplorerDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://autoapp.citronglobal.com/index.php");
		driver.get("https://google.com");
		// Certificate Error handling
		driver.get("javascript:document.getElementById('overridelink').click();"); // this is standard piece of code which is required to handle certificate error
		driver.findElement(By.id("username")).sendKeys("admin");;
		driver.manage().window().maximize();
//		driver.quit();
		

	}
}
