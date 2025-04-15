package _005_WebElement_Validation_Methods._2_Value_type_methods._2_getAttribute_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Use_getAttribute_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    String property_value = driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).getAttribute("aria-label");
		
	    System.out.println("Fetched Text : " + property_value);
		
	    driver.quit();
	}

}
