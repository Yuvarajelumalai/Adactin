package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver y = new ChromeDriver();
		y.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D60639568242%26hvpone%3D%26hvptwo%3D%26hvadid%3D617721280315%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3526729430254726311%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvtargid%3Dkwd-316976916880%26hydadcr%3D5841_2362028%26gclid%3DEAIaIQobChMIq-X6q7Gq-gIVin4rCh2dXgh2EAAYASAAEgKR-fD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		y.manage().window().maximize();
		WebElement name = y.findElement(By.xpath("//input[@type='email']"));
		System.out.println(name.isDisplayed());
		System.out.println(name.isEnabled());
		name.sendKeys("yuvaame@gmail.com");
		WebElement fp = y.findElement(By.id("continue"));
		System.out.println(fp.getText());
		fp.click();
		WebElement pw = y.findElement(By.name("password"));
		pw.sendKeys("raja@123");
		pw.clear();
		WebElement fpw = y.findElement(By.linkText("Forgot Password"));
		fpw.click();
}
}
