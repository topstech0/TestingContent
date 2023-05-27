package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S019_PartialLink {
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		//System.out.println(links.size());
		
	/*	for(WebElement link :links)
		{
			System.out.println(link.getText());
		}
	*/
		links.get(0).click();
	}

}
