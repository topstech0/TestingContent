package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Selenium Practice Form after showing the practicals
//https://www.techlistic.com/p/selenium-practice-form.html




public class S002_FB_Registration {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Documents\\testing\\latestdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//WebElement newA =  driver.findElement(By.linkText("Create new account"));
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_email__")).sendKeys("9895455578");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@qw");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(7); 
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
		
		Thread.sleep(3000);
		driver.close();		
		
	}

}
