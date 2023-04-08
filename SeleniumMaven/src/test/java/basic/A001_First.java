package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A001_First {
	
	public static void main(String[] args) {
				
				
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\chintan\\Documents\\testing\\latestdriver\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
				
				System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				String url = "https://www.facebook.com/";		
				driver.manage().window().maximize();
				driver.get(url);
				
				
				String myTitle = "Facebook";
				String actualTitle=driver.getTitle();
				
				System.out.println(actualTitle);
				
				if(myTitle.equals(actualTitle))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed"); 
				}
				driver.close();
				//driver.quit();
	}

}
