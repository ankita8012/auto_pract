package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingTables {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.partialLinkText("More")).click();
		
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		
		for(WebElement h:headers)
		{
			System.out.println("The Titles are : "+h.getText());
		}
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("The Total number of rows are: "+rows.size());
		//to find the elements of row at index 4
		System.out.println(rows.get(4).getText());
		
		//to get any random data within a given range,next bound is used where 0to 10 will 
		//be taken and 11 will be excluded
		
		Random  rmd = new Random();
		//int n = rmd.nextInt(11);
		
		int n = rmd.nextInt(rows.size());
		System.out.println(n);
		
		System.out.println(rows.get(n).getText());
		driver.close();
		
	}

}
