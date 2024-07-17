package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05PageSource {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://www.google.co.in/");
		
		String source = Driver.getPageSource();
		System.out.println(source);
		Driver.close();

	}

}
