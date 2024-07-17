package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMultipleWindows {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.online.citibank.co.in/");
		
		//close button on first add
		
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		
		//close button on second add
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
		
		System.out.println("The title is :"+driver.getTitle());
		Set<String>windows = driver.getWindowHandles();
	//concept of collections is used here , all list of open browser can be get here.
		Iterator<String> itr= windows.iterator();
		 String window1 = itr.next();
	     String window2 = itr.next();
	     System.out.println(window1);
	     System.out.println(window2);
	     
	     driver.switchTo().window(window2);
	     System.out.println(driver.getTitle());

	}

}
