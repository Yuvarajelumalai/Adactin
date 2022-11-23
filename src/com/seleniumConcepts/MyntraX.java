package com.seleniumConcepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraX {

	public void minimumNoOfPrices() {
		WebDriver y = new ChromeDriver();
		y.manage().window().maximize();
		y.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		List<Integer> pl = new LinkedList<>();
		List<WebElement> kurti = y.findElements(By.xpath("//li[@class='product-base']/a/div[2]/div/span"));
		System.out.println("****Minimum Price****");
		for (WebElement str : kurti) {
			String t = str.getText();
			int price = Integer.parseInt(t);
			pl.add(price);
		}
       Integer min = Collections .min(pl);
       System.out.println(min);
		
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\elang\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver1.exe");
		MyntraX f = new MyntraX();
        f.minimumNoOfPrices();        

}
}
