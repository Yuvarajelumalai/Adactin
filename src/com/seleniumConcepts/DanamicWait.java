package com.seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanamicWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
	WebDriver y = new ChromeDriver();
	y.manage().window().maximize(); 
	y.get("https://www.google.co.in/");
	
	//implicitlyWait
	y.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	y.findElement(By.name("q")).sendKeys("Ponni nathi pakkanum");
	y.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//descendant::input[@class='gNO89b']")).click();

	WebElement ex = y.findElement(By.xpath("//h3[@class='GmE3X']//following::span[@class='cHaqb'][1]"));
//	WebDriverWait w = new WebDriverWait(y, 10);
//	w.until(ExpectedConditions.visibilityOf(ex));
	ex.click();
	
	Thread.sleep(2000);
	y.findElement(By.xpath("//*[@id=\"movie_player\"]/div[32]/div[2]/div[1]/button")).click();
	
	
	
}
}
