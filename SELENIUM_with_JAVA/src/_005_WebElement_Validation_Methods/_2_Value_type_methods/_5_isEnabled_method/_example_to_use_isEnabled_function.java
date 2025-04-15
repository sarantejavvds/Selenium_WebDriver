package _005_WebElement_Validation_Methods._2_Value_type_methods._5_isEnabled_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_isEnabled_function
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://orangehrm.qedgetech.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   WebElement username = driver.findElement(By.name("txtUsername"));
		   
			boolean value_flag= username.isEnabled();
			
			System.out.println("Was username textbox Enabled? : " + value_flag);
			
			if(value_flag)
			{
				username.sendKeys("Admin");
			}
			else
			{
				System.out.println("username textbox is disabled");
			}
	}

}
