package basic;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * After the Program give the task on
 * 
 * https://demo.guru99.com/test/delete_customer.php
 *  
 */


import util.Driverconnection;

public class S009_AlertDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/alerts");	
		
		//btn-1		
				//WebElement btn =  driver.findElement(By.id("alertButton"));
				//btn.click();		
				//Alert alert = driver.switchTo().alert();
				//System.out.println(alert.getText());
				//alert.accept();
				
				
				//btn-2
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // here we are having explicit wait
				WebElement btn = driver.findElement(By.id("timerAlertButton"));
				btn.click();
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				
				//btn-3
//				WebElement btn = driver.findElement(By.id("confirmButton"));
//				btn.click();
//				Alert alert = driver.switchTo().alert();
//				//alert.accept();
//				alert.dismiss();
				
				
				//btn-4
//				WebElement btn = driver.findElement(By.id("promtButton"));
//				btn.click();
//				Alert alert = driver.switchTo().alert();
//				alert.sendKeys("Welcome");
//				alert.accept();
//				//alert.dismiss();
				
	}

}
