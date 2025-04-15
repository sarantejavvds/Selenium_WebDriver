package _005_WebElement_Validation_Methods._1_Void_type_methods._1_clear_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Use_clear_function 
{

	
	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://webapp.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		
	}

}
