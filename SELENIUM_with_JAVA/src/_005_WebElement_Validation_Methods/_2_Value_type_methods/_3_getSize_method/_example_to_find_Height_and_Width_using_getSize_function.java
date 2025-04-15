package _005_WebElement_Validation_Methods._2_Value_type_methods._3_getSize_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_find_Height_and_Width_using_getSize_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/* Get height and width of Username Textbox */
		WebElement Username_textbox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		Dimension dimension_of_Username_textbox = Username_textbox.getSize();
		
		System.out.println("Height of Username textbox : " + dimension_of_Username_textbox.height);
		
		System.out.println("Width of Username textbox : " + dimension_of_Username_textbox.width);
		
		driver.quit();
	}

}
