package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02CheckTitle {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://www.selenium.dev/");
		
		String Title= Driver.getTitle();
		System.out.println("The Title is"+ " " +Title);
		
		if(Title.equals("Selenium"))
			System.out.println("Test passes");
		else
			System.out.println("Test failed");
		Driver.close();
		

	}

}
