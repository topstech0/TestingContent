package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class S015_MouseEventDragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		// for every Mouse event we use Actions
		Actions builder = new Actions(driver);		
		//builder.clickAndHold(from).moveToElement(to).release().build().perform();
		//Thread.sleep(3000);
		//builder.clickAndHold(from1).moveToElement(to).release().build().perform();
		
		//to store the event
		
		Action e1 = builder.clickAndHold(from).moveToElement(to).release().build();		
		Action e2 = builder.clickAndHold(from1).moveToElement(to).release().build();
		
		e1.perform();
		Thread.sleep(3000);
		e2.perform();
		
		Thread.sleep(5000);
	
		//Now goto Practice Form and perform Subject
		
		driver.quit();
		
		
	}
	
}
