package com.aazaa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHeadLessMain {

	public static void main(String[] args) throws InterruptedException {
		
		// Load the selenium webdriver manually
		System.setProperty("webdriver.chrome.driver","/Users/lalangdembe/Desktop/DevOps Assignment/Selenium/chromedriver-mac-arm64/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		//Headless Mode
		chromeOptions.addArguments("--headless");
		
		//Create driver that will act on behalf of a user
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//Actions
		//1. Open the browser and get to the URL
		// Navigate to "facebook.com"
		driver.get("https://www.facebook.com/login/");
		System.out.println("Navigated to facebook");
		//Wait 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Locate the email for facebook login and enter the details
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		System.out.println("filled email");
		Thread.sleep(1000);
		//Locate the password for facebook login and enter the details
		driver.findElement(By.id("pass")).sendKeys("password");
		System.out.println("filled password");
		Thread.sleep(1000);
		// Find login element and click
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Logged in");
		Thread.sleep(1000);
		
		//Close the browser
//		driver.close();
	}

}
