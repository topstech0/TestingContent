package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Documents\\testing\\latestdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
