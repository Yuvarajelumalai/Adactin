package com.seleniumConcepts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotActionsMethod {

 public static void main(String[] args) throws AWTException {
	
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
	 WebDriver y = new ChromeDriver();
	 y.manage().window().maximize();
	 
	 y.get("https://testautomationpractice.blogspot.com/");
	 
	 Actions ac = new Actions (y);
	 Robot  rb = new  Robot();
	 
	 WebElement src = y.findElement(By.id("draggable"));
	
	 WebElement des = y.findElement(By.id("droppable"));
	 ac.dragAndDrop(src, des).build().perform();
	 
	 y.navigate().to("https://www.amazon.in/");
	 
	 WebElement today = y.findElement(By.linkText("Today's Deals"));
	 ac.moveToElement(today).perform();
	 WebElement mob = y.findElement(By.linkText("Mobiles"));
	 //ac.contextClick(mob).perform();
	 ac.doubleClick(mob).perform();
//	 rb.keyPress(KeyEvent.VK_DOWN);
//	 rb.keyRelease(KeyEvent.VK_DOWN);
//	 
//	 rb.keyPress(KeyEvent.VK_ENTER);
//	 rb.keyPress(KeyEvent.VK_ENTER);
//	 
	 
}
	
	
	
	
	
	
}
