package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04Currenturl {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://www.google.co.in/");
		String url= Driver.getCurrentUrl();
		if( url.contains("google"))
				System.out.println("Test pass");
		else
			System.out.println("Test failed");
		
		Driver.close();
	}

}
