package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fevents%2Fgreatindianfestival%3Ftag%3Dgoogmantxtdsk30-21%26ascsubtag%3D_k_EAIaIQobChMIuaeIm_On-gIVnJJmAh0ldQb_EAAYASAAEgJyTvD_BwE_k_%26gclid%3DEAIaIQobChMIuaeIm_On-gIVnJJmAh0ldQb_EAAYASAAEgJyTvD_BwE%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("yuvaame@gmail.com");
	
	WebElement co = driver.findElement(By.id("continue"));
	co.click();
	
	WebElement psw = driver.findElement(By.id("ap_password"));
	psw.sendKeys("yuvi@123");
	
	WebElement lg = driver.findElement(By.id("signInSubmit"));
    lg.click();
    
   
    
    
}
}
