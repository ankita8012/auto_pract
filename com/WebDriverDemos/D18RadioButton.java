package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18RadioButton {

	public static void main(String[] args) {
		
		  WebDriver Driver = new ChromeDriver();
			
			Driver.manage().window().maximize();
			Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			
			WebElement GenderF = Driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]"));
			
			System.out.println("Before...");
			System.out.println("Selected:"+GenderF.isSelected());
			System.out.println("Enabled:" + GenderF.isEnabled());
			System.out.println("Displayed:" + GenderF.isDisplayed());
			
			GenderF.click();
			
			
			System.out.println("\nAfter");
			System.out.println("Selected:"+GenderF.isSelected());
			System.out.println("Enabled:" + GenderF.isEnabled());
			System.out.println("Displayed:" + GenderF.isDisplayed());
			
			Driver.close();

	}

}
