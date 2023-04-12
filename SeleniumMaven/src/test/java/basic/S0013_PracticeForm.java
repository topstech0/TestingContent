package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class S0013_PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Ritul");
		driver.findElement(By.id("lastName")).sendKeys("Kharva");
		driver.findElement(By.id("userEmail")).sendKeys("ritul@gmail.com");
		driver.findElement(By.xpath("//*[@id='gender-radio-1']/following-sibling::label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8369391742");
				
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		String myDate = "27";
		String myMonth="October";
		//String myYear="2020"; check this year for checking purpose.
		String myYear="2022";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
		for(WebElement date : dates)
		{
			String dt = date.getText();
			//System.out.println(dt);
			
			if(dt.equals(myDate))
			{
				String label = date.getAttribute("aria-label");
				
				if(label.contains(myMonth))
				{
					date.click();
					break;
				}
			}
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
