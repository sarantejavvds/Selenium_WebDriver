package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Properties._Using_Relative_Xpaths._1_Using_Contains_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_contains_function
{

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://facebook.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("Hello");
	}

}
