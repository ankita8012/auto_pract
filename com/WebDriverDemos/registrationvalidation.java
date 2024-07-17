package com.WebDriverDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationvalidation {
	
	    @Test
	    public void testRegistration() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/login.php");

	        
	        driver.findElement(By.cssSelector("text")).sendKeys("esdfgh");
	        driver.findElement(By.id("pass")).sendKeys("sdfgh");

	        driver.findElement(By.id("loginbutton"));

	        
	        String expectedUrl = "https://www.facebook.com/";
	        String actualUrl = driver.getCurrentUrl();
	        Assert.assertEquals(actualUrl, expectedUrl);

	       
	        driver.quit();
	    }
	}


