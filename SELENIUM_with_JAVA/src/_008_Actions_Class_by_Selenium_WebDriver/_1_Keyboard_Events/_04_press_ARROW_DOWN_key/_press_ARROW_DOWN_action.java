package _008_Actions_Class_by_Selenium_WebDriver._1_Keyboard_Events._04_press_ARROW_DOWN_key;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _press_ARROW_DOWN_action 
{

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://toram.jp");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		System.out.println("Before Down Arrow ");
		
		action.sendKeys(Keys.ARROW_DOWN).perform();

		System.out.println("After Down Arrow");
		
	}

}
