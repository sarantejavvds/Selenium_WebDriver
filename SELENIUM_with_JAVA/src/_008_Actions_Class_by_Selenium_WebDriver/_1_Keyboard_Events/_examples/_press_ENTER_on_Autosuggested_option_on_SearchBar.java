package _008_Actions_Class_by_Selenium_WebDriver._1_Keyboard_Events._examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _press_ENTER_on_Autosuggested_option_on_SearchBar 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&authuser=0&ogbl");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement input_SearchBox = driver.findElement(By.xpath("//textarea[@name = 'q']"));	
		

		action.moveToElement(input_SearchBox).sendKeys("Toram online").perform();
		
		
		/* Click on 5th option */
		for(int i = 0; i < 5; i++) 
		{
			action.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		action.sendKeys(Keys.ENTER).perform();

	}

}
