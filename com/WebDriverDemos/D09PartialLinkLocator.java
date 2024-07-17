package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09PartialLinkLocator {

	public static void main(String[] args) {
		 WebDriver Driver = new ChromeDriver();
			
			Driver.manage().window().maximize();
			Driver.get("https://www.google.co.in/");
			
			WebElement adLink = Driver.findElement(By.partialLinkText("Ad"));
			
			adLink.click();
			
			Driver.close();

	}

}
