package com.aazaa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMain {

	public static void main(String[] args) throws InterruptedException {
		
		// Load the selenium webdriver manually
		System.setProperty("webdriver.chrome.driver","/Users/lalangdembe/Desktop/DevOps Assignment/Selenium/chromedriver-mac-arm64/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		
		//Create driver that will act on behalf of a user
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//Actions
		//1. Open the browser and get to the URL
		// Navigate to "facebook.com"
		driver.get("https://www.facebook.com/login/");
		
		//Wait 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Locate the email for facebook login and enter the details
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		Thread.sleep(1000);
		//Locate the password for facebook login and enter the details
		driver.findElement(By.id("pass")).sendKeys("password");
		
		Thread.sleep(1000);
		// Find login element and click
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1000);
		
		//Close the browser
//		driver.close();
	}

}
