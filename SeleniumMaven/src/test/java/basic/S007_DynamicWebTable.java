package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Practice Link : After showing the practicals
 * 
 * https://cosmocode.io/automation-practice-webtable/
 * 
 * 
 */



public class S007_DynamicWebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing-Material\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
		//**********theader****
		List<WebElement> thead = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		for(int i=1;i<=thead.size();i++)
		{
			String data = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th["+i+"]")).getText();
			System.out.print(data+" | ");
			
		}
		
		System.out.println("\n");
		
		//******tbody*********
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				String data1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th[1]")).getText();
				String data2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data1+" | "+data2+" | ");
			}
			System.out.println();
			
		}
		
		
		
		System.out.println();
		//**********tfooter********************
		List<WebElement> tfoot = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
		
		for(int i=1;i<=thead.size();i++)
		{
			String data1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th["+i+"]")).getText();
			String data2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td["+i+"]")).getText();
			System.out.print(data1+" | "+data2);
			
		}
	}

}
