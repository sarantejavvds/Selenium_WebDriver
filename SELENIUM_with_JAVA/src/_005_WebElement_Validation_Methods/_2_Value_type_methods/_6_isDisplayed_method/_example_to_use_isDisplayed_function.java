package _005_WebElement_Validation_Methods._2_Value_type_methods._6_isDisplayed_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_isDisplayed_function
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://orangehrm.qedgetech.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   WebElement loginbutton = driver.findElement(By.name("Submit"));
		   
			boolean value_flag = loginbutton.isDisplayed();
			System.out.println("was Login button Displayed? : " + value_flag);
			
			if(value_flag)
			{
				System.out.println("Login button displayed in login page");
				loginbutton.submit();
			}
			else
			{
				System.out.println("Login button is Not displayed in login page");
			}
			
			driver.quit();
	}

}
