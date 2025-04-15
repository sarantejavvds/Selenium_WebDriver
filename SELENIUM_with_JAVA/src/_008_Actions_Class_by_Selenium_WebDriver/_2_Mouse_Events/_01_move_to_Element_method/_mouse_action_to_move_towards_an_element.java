package _008_Actions_Class_by_Selenium_WebDriver._2_Mouse_Events._01_move_to_Element_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _mouse_action_to_move_towards_an_element
{

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&authuser=0&ogbl");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement input_SearchBox = driver.findElement(By.xpath("//textarea[@name = 'q']"));	
		
		action.moveToElement(input_SearchBox).perform();
		
		Thread.sleep(5000);
		
		action.moveToElement(input_SearchBox).sendKeys("Toram online").perform();
		
	
	}

}
