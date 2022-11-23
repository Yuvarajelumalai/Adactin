package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaFrame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver y = new ChromeDriver();
		
		y.manage().window().maximize();
		y.get("https://www.instagram.com/");
		
		y.findElement(By.name("username")).sendKeys("yuvaame@mail.com");
		
		y.findElement(By.name("password")).sendKeys("Raja@123");
		
		y.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
