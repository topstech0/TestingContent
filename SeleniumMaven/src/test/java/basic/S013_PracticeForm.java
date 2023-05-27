package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class S013_PracticeForm {
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://demoqa.com/automation-practice-form");
		
		// First show S017_ScrollDemoPractical.		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		//3) Scrolling down the page till the Bottom of page.
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//
        
        
		driver.findElement(By.id("firstName")).sendKeys("abcd");
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		driver.findElement(By.id("userEmail")).sendKeys("usermail@gmail.com");
		driver.findElement(By.xpath("//*[@id='gender-radio-1']/following-sibling::label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9895427784");		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		String myDate = "7";
		String myMonth="January";		
		String myYear="2020";
		
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
		
		
		// To perform subject we first practice MouseEvent and Keyboard Event
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		
		Actions builder = new Actions(driver);
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']/following-sibling::label")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\images\\mob4.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Surat");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
	}

}
