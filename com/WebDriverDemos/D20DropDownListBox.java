package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20DropDownListBox {

	public static void main(String[] args) {
		
		  WebDriver Driver = new ChromeDriver();
			
			Driver.manage().window().maximize();
			Driver.get("https://demoqa.com/select-menu");
			
			WebElement listbox = Driver.findElement(By.name("cars"));
			Select differentcars = new Select (listbox);
			
			List<WebElement>carlist = differentcars.getOptions();
			
			for(WebElement c:carlist)
			{
				System.out.println(c.getText());
			}
			
			
			if(differentcars.isMultiple())
			{
				differentcars.selectByIndex(1);
				differentcars.selectByIndex(3);
				
			List<WebElement> listofcars = differentcars.getAllSelectedOptions();
			System.out.println("Selected car...");
			
			for(WebElement selectedcars:listofcars) 
			{
				System.out.println("The selected cars are   "+selectedcars.getText());
			}
			}
			

	}

}
