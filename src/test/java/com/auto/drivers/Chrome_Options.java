package com.auto.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Chrome_Options {
		// pre requisites - Ensure to have latest version of chrome and the chromedriver
		// logs
		// binary
		// profiling
		// notifications
		// certificate
		// page load strategy
		// proxy
	@Test
	public void launchConfiguredChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Libraries\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		//notifications - enabling/disabling notifications
		options.addArguments("--disable-notifications");
		
		//disableinfobars - this will disable infobars at top
		options.addArguments("--disable-infobars");

		//start browser maximized 
		options.addArguments("--start-maximized");
		
		// to add proxy server site
//		options.addArguments("--proxy-server=http://83.209.94.87.8123");
		
		// Profiling is linked to the gmail id
		// in chrome go to "chrome://version" you can find the the Profile Path 
//		options.addArguments("user-data-dir=C:\\Users\\ssidappa\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		
		options.setPageLoadStrategy(PageLoadStrategy.NONE); // Note: Chrome doesent support Eager in page load strategy
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"null");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://autoapp.citronglobal.com/index.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.manage().window().maximize();
//		driver.quit();
		
	}

}
