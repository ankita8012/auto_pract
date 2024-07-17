package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocatedByLinkTextAndGetAttribute {

	public static void main(String[] args) {
	
		 WebDriver Driver = new ChromeDriver();
			
			Driver.manage().window().maximize();
			Driver.get("https://www.google.co.in/");
			
			WebElement gmaillink = Driver.findElement(By.linkText("Gmail"));
			String GmailLinkText=gmaillink.getText();
			System.out.println(GmailLinkText);
			
			String url=gmaillink.getAttribute("href");
			System.out.println("the link is : "+ url);
			
			gmaillink.click();
			
			


			
			Driver.close();

	}

}
