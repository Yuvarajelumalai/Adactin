package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
	
	WebDriver y = new ChromeDriver();
	
	y.manage().window().maximize();
	
	y.get("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	y.findElement(By.xpath("(//*[@id=\"search\"])[2]")).sendKeys("ponni nathi");
	
	y.findElement(By.cssSelector("button#search-icon-legacy")).click();
	
	
	Thread.sleep(3000);
	
	y.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-img-shadow/img")).click();

	
		
}

}
