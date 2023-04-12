package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

/*
 * After showing practical : give task on datepicker i.e click on textbox
 * 
 * i.e  type in google  -> datepicker in selenium practice
 * 
 * 	->  https://www.globalsqa.com/demo-site/datepicker/
 * 
 * 
 * 
 */

public class S011_IframeSwitch {
	
	public static void main(String[] args) {
		
		WebDriver driver  = Driverconnection.connect();
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		
		
			WebElement f1 = driver.findElement(By.id("frame1"));
			driver.switchTo().frame(f1);
			
			WebElement element = driver.findElement(By.id("sampleHeading"));
			String data = element.getText();
			System.out.println(data);
		
		/*
		for(WebElement ele : frames)
		{
			//System.out.println(ele.getAttribute("id"));
			System.out.println(ele.getAttribute("src"));
		}
		*/
		
	}

}
