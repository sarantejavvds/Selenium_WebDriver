package _008_Actions_Class_by_Selenium_WebDriver._1_Keyboard_Events._02_press_TAB_key;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _press_TAB_action 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		System.out.println("Before TABs");
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.sendKeys(Keys.TAB).perform();

		System.out.println("After TABs");
		
	}

}
