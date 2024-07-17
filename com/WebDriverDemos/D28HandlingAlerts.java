package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//alert and javascriptexecuter is interface.
		//javascriptexcuter is uded to run any javascript command 
		Alert alt;
		JavascriptExecutor js;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/alerts");
		
		js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollby(0,250)","");
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		//driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();   // will click on ok button since ok button of alert has no x path or any identity.
		// by default accept method is there to click on ok button.
		//driver.close();
		
		
		js.executeScript("arguments[0].click()",driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		//dismiss is used to click on cancel in alerts.
		js.executeScript("arguments[0].click()",driver.findElement(By.id("confirmButton")));
		//driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		
		js.executeScript("arguments[0].click()",driver.findElement(By.id("promtButton")));
		alt= driver.switchTo().alert();
		alt.sendKeys("ankita");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
		
		
		
	}
	

}
