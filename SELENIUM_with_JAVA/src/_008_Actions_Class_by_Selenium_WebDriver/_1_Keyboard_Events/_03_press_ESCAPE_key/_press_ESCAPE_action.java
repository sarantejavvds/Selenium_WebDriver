package _008_Actions_Class_by_Selenium_WebDriver._1_Keyboard_Events._03_press_ESCAPE_key;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _press_ESCAPE_action 
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
		
		action.sendKeys(Keys.ENTER).perform();
		
		System.out.println("Before ESCAPE");
		
		
		driver.findElement(By.xpath("(//div)[80]")).click();
		
		action.sendKeys(Keys.ESCAPE).perform();

		System.out.println("After ESCAPE");
		
	}

}
