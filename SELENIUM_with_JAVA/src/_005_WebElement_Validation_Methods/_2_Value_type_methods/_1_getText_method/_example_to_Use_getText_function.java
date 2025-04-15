package _005_WebElement_Validation_Methods._2_Value_type_methods._1_getText_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Use_getText_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toram.jp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    String text = driver.findElement(By.xpath("//a[normalize-space()='LANGUAGE']")).getText();
		
	    System.out.println("Fetched Text : " + text);
		
		driver.quit();
	}

}
