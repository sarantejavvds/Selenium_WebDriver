package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Properties._Using_Relative_Xpaths._2_Using_Starts_with_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_starts_with_function 
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://facebook.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElement(By.id("email")).sendKeys("demo.qedge@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("demo123");
			driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
	}

}
