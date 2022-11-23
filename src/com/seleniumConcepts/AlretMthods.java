package com.seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretMthods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		WebElement simpel = driver.findElement(By.id("accept"));
		simpel.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		WebElement confrim = driver.findElement(By.id("confirm"));
		confrim.click();
		Thread.sleep(3000);
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.dismiss();
		
		WebElement promt = driver.findElement(By.id("prompt"));
		promt.click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Yuvaraj");
		System.out.println(alert.getText());
		alert.accept();

	}

}
