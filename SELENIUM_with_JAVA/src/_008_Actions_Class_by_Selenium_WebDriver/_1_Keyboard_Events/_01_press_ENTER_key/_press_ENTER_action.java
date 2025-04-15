package _008_Actions_Class_by_Selenium_WebDriver._1_Keyboard_Events._01_press_ENTER_key;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _press_ENTER_action 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://gmail.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		System.out.println("Before ENTER");
		
		action.sendKeys(Keys.ENTER).perform();

		System.out.println("After ENTER");
		
	}

}
