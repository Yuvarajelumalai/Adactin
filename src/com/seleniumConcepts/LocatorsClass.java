package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzODM3NjkwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("9962666637");
	
	WebElement psw = driver.findElement(By.id("pass"));
	psw.sendKeys("9999");
	
	WebElement lg = driver.findElement(By.id("loginbutton"));
	lg.click();
		
	}
}
