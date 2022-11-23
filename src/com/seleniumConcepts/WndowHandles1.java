package com.seleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WndowHandles1 {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
		WebDriver y = new ChromeDriver();
		y.manage().window().maximize();

		y.get("https://www.amazon.in/");

		Actions ac = new Actions(y);
		Robot rb = new Robot();
		
		WebElement bk = y.findElement(By.linkText("Mobiles"));
		ac.contextClick(bk).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement bs = y.findElement(By.linkText("Best Sellers"));
		ac.contextClick(bs).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement ts = y.findElement(By.linkText("Today's Deals"));
		ac.contextClick(ts).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement mo = y.findElement(By.linkText("Mobiles"));
		ac.contextClick(mo).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allid = y.getWindowHandles();
		System.out.println(allid);

		for (String id : allid) {
			String title = y.switchTo().window(id).getTitle();
			System.out.println(title);
		}

		String name = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String id : allid) {
			if (y.switchTo().window(id).getTitle().equals(name)) {
				break;
			}

		}

	}

}
