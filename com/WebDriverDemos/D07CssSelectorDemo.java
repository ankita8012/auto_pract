package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07CssSelectorDemo {

	public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/index.php/");
		
		WebElement UserName= Driver.findElement(By.cssSelector("input[name='email']"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement pwd = Driver.findElement(By.cssSelector("input[id=\"pass\"][name='pass']"));
		pwd.sendKeys("fqgsvuhsx");
		
		WebElement loginbtn = Driver.findElement(By.cssSelector("button[value=\"1\"]"));
		loginbtn.click();
		
		WebElement error = Driver.findElement(By.className("_9ay7"));
		String errmsg = error.getText();
		System.out.println(errmsg);
		
		Driver.close();

	}

}
