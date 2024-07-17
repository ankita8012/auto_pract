package com.WebDriverDemos;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.Select;  



public class dropdownproject {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();  
        driver.navigate().to("https://www.cbse.gov.in/cbsenew/cbse.html");      
        Select dropdown = new Select(driver.findElement(By.linkText("CBSE Schools")));
        
        dropdown.selectByVisibleText("Affiliation types");  
        driver.close();  
         }

		

	}


