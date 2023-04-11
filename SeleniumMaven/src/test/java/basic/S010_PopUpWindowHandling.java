package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S010_PopUpWindowHandling {

	public static void main(String[] args) {

		WebDriver driver = Driverconnection.connect();

		driver.get("https://demo.guru99.com/popup.php");

		String mainWin = driver.getWindowHandle(); // 1st win
		System.out.println(mainWin);

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> allwins = driver.getWindowHandles();

		for (String win : allwins) {
			// System.out.println("all : "+win);

			if (!win.equals(mainWin)) // i.e if first is not equal to 2nd window then
			{
				driver.switchTo().window(win);
			}
		}

		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();

		/*
		 * driver.close();//it will close the second window
		 * driver.switchTo().window(mainWin); // it will switch to main window
		 * //Thread.sleep(1000); driver.close();// it will close the main window or it
		 * will close single tab/window.
		 */

		driver.quit(); // it will close all the tab.
	}
}
