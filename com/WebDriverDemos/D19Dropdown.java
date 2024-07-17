package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class  D19Dropdown{
   public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
      
      WebElement drplist = driver.findElement(By.id("country"));
      
      Select countries = new Select(drplist);
      
      System.out.println("Selected country: "+ countries.getFirstSelectedOption().getText());
      
      List<WebElement>countryList = countries.getOptions();
      
      //list of all the countries
      
      System.out.println("The list of all country is:"+ countryList.size());
      
      /*if want serial no.denoted before countries, then to write
      
      int i =1;
      
      for(WebElement county:countryList);
      {
    	  System.out.println(i +"-"+country.gettext());
    	  i++;
      }
      */
      for(WebElement country: countryList)
      {
    	  System.out.println(country.getText());
      }
      
      countries.selectByVisibleText("Bhutan");
      
      //countries can be selected by values,or index also,written below.value is written inside quotes.
      
      //countries.selectByValue("222");
      
      //countries.selectByIndex(219);
      System.out.println("The selected country is : "+countries.getFirstSelectedOption().getText());
      driver.close();
   }
}
