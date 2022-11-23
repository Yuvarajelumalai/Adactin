package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleWebdriver {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement creat = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creat.click();

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Yuvaraj");

		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Elumalai");

		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("yuvaame@gmail.com");

		WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("yuvaame@gmail.com");

		WebElement psw = driver.findElement(By.id("password_step_input"));
		psw.sendKeys("123456789");

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("24");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");

		WebElement ck = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		ck.click();

		WebElement ck1 = driver.findElement(By.name("websubmit"));
		ck1.click();

	}

}
