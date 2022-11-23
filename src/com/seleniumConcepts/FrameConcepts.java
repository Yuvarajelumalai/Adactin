package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver y = new ChromeDriver();
	
	y.manage().window().maximize();
	y.get("https://letcode.in/frame");
	
	y.switchTo().frame("firstFr");
//	y.switchTo().frame(1);
	Thread.sleep(2000);
	y.findElement(By.name("fname")).sendKeys("YUVA");
	
	y.findElement(By.name("lname")).sendKeys("RAJ");
	
	WebElement element = y.findElement(By.xpath("//iframe[@src='innerFrame']"));
	y.switchTo().frame(element);
	
	Thread.sleep(2000);
	
	y.findElement(By.name("email")).sendKeys("raj@gmail.com");
	
	y.switchTo().parentFrame();
	
	y.switchTo().defaultContent();
	
//	y.findElement(By.linkText("Watch tutorial")).click();
	
	
}
}
