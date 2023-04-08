package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S003_OrangeHRMS {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Documents\\testing\\latestdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12344");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
	}

}
