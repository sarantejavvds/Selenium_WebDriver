package _006_Locators_Available_in_Selenium.Using_classname_of_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_very_first_Element_with_help_of_classname
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.className("MV3Tnb")).click(); /* To click on About link, because it was very first link available with classname */
		
		driver.quit();
	}

}
