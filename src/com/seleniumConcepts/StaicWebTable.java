package com.seleniumConcepts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaicWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
		WebDriver y = new ChromeDriver();
		y.manage().window().maximize();
		y.get("https://letcode.in/table");
		System.out.println("All Data");
		List<WebElement> alldata = y.findElements(By.xpath("(//table)[1]/tbody/tr"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}
		System.out.println();
		System.out.println("RowData");
		List<WebElement> row = y.findElements(By.xpath("(//table)[2]/tbody/tr/td[1]"));
		for (WebElement rd : row) {
			System.out.println(rd.getText());	
		}
		System.out.println();
		System.out.println("clm data");
		List<WebElement> clm = y.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
		for (WebElement co : clm) {
		System.out.println(co.getText());
		}
		System.out.println();
		System.out.println("Particuar");
		WebElement p = y.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[3]"));
		System.out.println(p.getText());
		System.out.println();
		System.out.println("Table Name");
		List<WebElement> tn = y.findElements(By.xpath("(//thead)[3]"));
		for (WebElement tb : tn) {
			System.out.println(tb.getText());
	
		}	
		}
	
		}


