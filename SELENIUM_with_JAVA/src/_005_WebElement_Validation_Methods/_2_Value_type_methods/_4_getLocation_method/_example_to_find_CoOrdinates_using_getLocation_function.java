package _005_WebElement_Validation_Methods._2_Value_type_methods._4_getLocation_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_find_CoOrdinates_using_getLocation_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/* get an element location */
		// WebElement signIn_element = driver.findElement(By.xpath("(//a[@class='a-button-text'])[2]"));	
		WebElement Store_element = driver.findElement(By.xpath("//a[normalize-space()='Store']"));
		
		/* create object for point class */
		Point point_of_Store = Store_element.getLocation();
		
		Store_element.click();
				
		System.out.println("X cordinate : " + point_of_Store.getX() + " ..... " + "Y cordinate: " + point_of_Store.getY());
		
		driver.quit();
	}

}
