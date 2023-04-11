package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S004_PracticeForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Ritul");
		driver.findElement(By.name("lastname")).sendKeys("Kharva");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		List<WebElement> exps = driver.findElements(By.name("exp"));
		exps.get(3).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("24-03-2023");
		
		//List<WebElement> profs = driver.findElements(By.name("profession"));
		//profs.get(1).click();
		
		driver.findElement(By.id("profession-1")).click();
		
		//List<WebElement> tools = driver.findElements(By.name("tool"));
		//tools.get(2).click();
		
		driver.findElement(By.id("tool-2")).click();
		
		WebElement cont = driver.findElement(By.id("continents"));
		Select conts = new Select(cont);
		conts.selectByVisibleText("Australia");
		
		WebElement command = driver.findElement(By.id("selenium_commands"));
		Select commands = new Select(command);
		commands.selectByVisibleText("Browser Commands");
		commands.selectByVisibleText("Switch Commands");
		
	}
	
}
