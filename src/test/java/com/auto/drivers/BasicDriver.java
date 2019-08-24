package com.auto.drivers;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Test;

public class BasicDriver {

	@Test
	public void launchSite() {
//		For Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Java Libraries\\drivers\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://autoapp.citronglobal.com/index.php");
//		driver.manage().window().maximize();
//		driver.close(); // This closes the window under focus 
//		driver.quit(); // This completely closes the browser and terminates the driver and end selenium session
		
//		For Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Libraries\\drivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "C:\\Java Libraries\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://autoapp.citronglobal.com/index.php");
		driver.manage().window().maximize();
		driver.close(); // This closes the window under focus
		driver.quit(); // This completely closes the browser and terminates the driver and end selenium session
		
//		For IE
//		System.setProperty("webdriver.ie.driver", "C:\\Java Libraries\\drivers\\IEDriverServer.exe");
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "C:\\Java Libraries\\drivers\\IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		driver.get("https://autoapp.citronglobal.com/index.php");
//		driver.manage().window().maximize();
//		driver.close(); // This closes the window under focus
//		driver.quit(); // This completely closes the browser and terminates the driver and end selenium session

//		For Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Java Libraries\\drivers\\MicrosoftWebDriver.exe");
//		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, "C:\\Java Libraries\\drivers\\MicrosoftWebDriver.exe");
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://autoapp.citronglobal.com/index.php");
//		driver.manage().window().maximize();
//		driver.close(); // This closes the window under focus
//		driver.quit(); // This completely closes the browser and terminates the driver and end selenium session
//		
	}
}
