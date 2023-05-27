package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S017_ScrollDemo {

	public static void main(String[] args) {
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		
		//open the scroll-bar/ javascript code in google.
		//1) to perform Scroll on application using Selenium-
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		//js.executeScript("window.scrollBy(0,350)");		
		
		//2) Scrolling down the page till the element is found
		WebElement Element = driver.findElement(By.id("uploadPicture"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
     //3) Scrolling down the page till the Bottom of page.
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
