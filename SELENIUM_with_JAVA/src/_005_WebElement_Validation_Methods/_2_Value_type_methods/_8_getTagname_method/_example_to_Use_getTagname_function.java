package _005_WebElement_Validation_Methods._2_Value_type_methods._8_getTagname_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Use_getTagname_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toram.jp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    String tag_Name = driver.findElement(By.xpath("//a[normalize-space()='LANGUAGE']")).getTagName();
		
	    System.out.println("Fetched Text : " + tag_Name);
		
		driver.quit();
	}

}
