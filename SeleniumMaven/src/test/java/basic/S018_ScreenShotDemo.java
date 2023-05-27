package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S018_ScreenShotDemo {

	//First put the jar file and then write the code.
	//For jar file - type : commons io maven and take the latest version.copy jar code 
	//and paste in pom.xml 
	
	
	public static void getScreenShot(WebDriver driver,String path)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screen shot taken.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect();
		driver.get("https://topsint.com/topserp/");
		getScreenShot(driver,"F:\\img\\s1.jpg");
		
		driver.findElement(By.name("btn_login")).click();
		Thread.sleep(1000);
		getScreenShot(driver,"F:\\img\\error.jpg");
		
	}
}
