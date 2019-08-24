package com.auto.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class Firefox_Options {
	// pre requisites
	// logs
	// binary
	// profiling
	// notifications
	// certificate
	// page load strategy
	// proxy
	@Test
	public void launchConfiguredFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Java Libraries\\drivers\\geckodriver.exe");
		//logs
//		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");// replacing null with location of the file then it creates log in the specified file ex: "D:\\firefox.log"
		FirefoxOptions options = new FirefoxOptions();
		// binary (set the installed firefox exe file path)
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		// Page load strategy
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);// if we send None it will access the element once it loads it wont wait until the page loads
		
		// Profiling in Firefox - user browser customized profiling 
		ProfilesIni allProf= new ProfilesIni();
		FirefoxProfile selectedProfile = allProf.getProfile("Santhosh");
		
		//notifications - enabling/disabling notifications
		selectedProfile.setPreference("dom.webnotifications.enabled", false);
		
		//certificate management
		selectedProfile.setAcceptUntrustedCertificates(true);
		selectedProfile.setAssumeUntrustedCertificateIssuer(false);
		
		// proxy management
//		selectedProfile.setPreference("network.proxy.type", 1);
//		selectedProfile.setPreference("network.proxy.socks", "83.209.94.87");
//		selectedProfile.setPreference("network.proxy.socks_port", 35923);
		
		options.setProfile(selectedProfile);
		// notifications 
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://autoapp.citronglobal.com/index.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.manage().window().maximize();
//		driver.quit();
	}
}
