package com.seleniumConcepts;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");

		WebDriver y = new ChromeDriver();	
		y.manage().window().maximize();
		y.get("https://www.flipkart.com/mobile-phones-store");
		WebElement scd = y.findElement(By.linkText("Contact Us"));	
		JavascriptExecutor js = (JavascriptExecutor) y ;
		js.executeScript("arguments[0].scrollIntoView();",scd);
		TakesScreenshot ts = (TakesScreenshot)y;
		File as = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\elang\\eclipse-workspace\\Selenium\\ScreenShot\\flip.png");
		
		FileUtils.copyFile(as, des);
		
			
			
		
	}

}
