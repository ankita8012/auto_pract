package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D25HeadlessAndIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		op.addArguments("--incognito");
		op.addArguments("start-maximized");
	
		  WebDriver Driver = new ChromeDriver(op);
		  Driver.manage().window().maximize();
		  Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Driver.get("https://www.facebook.com/index.php/");
		  System.out.println("The Title is "+ Driver.getTitle());
		  
		  Driver.close();
	}

}
