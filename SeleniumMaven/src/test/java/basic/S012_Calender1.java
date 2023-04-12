package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S012_Calender1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement element =driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(element);
		
		driver.findElement(By.id("datepicker")).click();
		
		String myDate = "7";
		String myMonth="January";
		//String myYear="2020"; check this year for checking purpose.
		String myYear="2020";
		
		//String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		//System.out.println(month);
		
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		//Converting into Integer for Comparing the two years.
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear);
		
		while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) 
		{		
			if(y1>y2)
			{
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		
		
		while(!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) 
		{
			if(y1>y2)
			{
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		
				
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : dates)
		{
			String dt = date.getText();
			//System.out.println(dt);
			
			if(dt.equals(myDate))
			{
				date.click();
			}
		}   
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
