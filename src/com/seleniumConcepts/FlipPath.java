package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/lifestyle-big-billion-days-store?fm=neo%2Fmerchandising&iid=M_e98013b3-1053-47bd-8b32-41f94ca77bac_1_LFZDN752UAJV_MC.MAGMJ6L3VQ88&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion_MAGMJ6L3VQ88&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=MAGMJ6L3VQ88");
		
	WebElement ck = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
	ck.click();
		
		//WebElement xp = driver.findElement(By.xpath("//a[@class='_3QN6WI']"));
		//xp.click();
	}

}
