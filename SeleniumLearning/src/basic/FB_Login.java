package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Login {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Documents\\testing\\latestdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.sendKeys("tops@gmail.com");
		pass.sendKeys("123");
		login.click();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		driver.close(); //it will close the current browser.
		//driver.quit(); //it will close more than one window.
		
	}

}
