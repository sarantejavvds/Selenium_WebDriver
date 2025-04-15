package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Location._2_Partial_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_Partial_Xpath
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/* "+" icon at bottom */
		driver.findElement(By.xpath("//div/ul/li[12]/a/i")).click();
		
		driver.findElement(By.xpath("//div[3]/div[1]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//div[4]/table/tbody/tr/td[3]/ul/li[6]/div/a")).click();
	}

}
