package com.seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://letcode.in/dropdowns");
	
	WebElement cl = driver.findElement(By.id("fruits"));
	cl.click();
	
	WebElement multiple = driver.findElement(By.id("superheros"));
	Select s =new Select(multiple);
	System.out.println(s.isMultiple());
	
	s.selectByVisibleText("Ant-Man");
	s.selectByValue("aq");
	s.selectByVisibleText("The Avengers");
	s.selectByValue("bt");
	
	s.deselectByVisibleText("Ant-Man");
	s.deselectByVisibleText("The Avengers");
	
	List<WebElement> options = s.getOptions();
	for (WebElement set : options) {
		System.out.println(set.getText());
	}
		System.out.println("Selected Options: ");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selectedOptions : allSelectedOptions) {
			System.out.println(selectedOptions.getText());		
			
		}
		System.out.println("First Selected:");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		s.deselectAll();
		
		
		
	}
	

	

	
	
	
}

