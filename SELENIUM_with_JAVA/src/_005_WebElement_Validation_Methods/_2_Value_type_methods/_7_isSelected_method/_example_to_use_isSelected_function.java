package _005_WebElement_Validation_Methods._2_Value_type_methods._7_isSelected_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_isSelected_function
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver   driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   WebElement checkbox = driver.findElement(By.name("remember"));
		   
			boolean value = checkbox.isSelected();
			
			System.out.println("was the checkbox is already Selected? : " + value);
			
			if(value)
			{
				checkbox.click();
				
				System.out.println("Unchecked the checkbox...");
			}
	}

}
