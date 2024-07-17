package com.WebDriverDemos;


import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotassignment {

	public static void main(String[] args)throws Exception {
		 
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
		Driver.get("https://www.google.co.in/");
			
		File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\ANKITA\\Desktop\\screenshot\\page.png"));
			

	}

}
