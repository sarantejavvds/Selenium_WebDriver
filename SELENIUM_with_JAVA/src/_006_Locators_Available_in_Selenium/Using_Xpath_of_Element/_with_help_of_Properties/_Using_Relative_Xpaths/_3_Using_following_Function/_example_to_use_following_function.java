package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Properties._Using_Relative_Xpaths._3_Using_following_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _example_to_use_following_function
{

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().deleteAllCookies();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://flights.qedgetech.com/");
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElement(By.xpath("//a[starts-with(text(),'Reg')]")).click();
		   
                /* Name */		   
			driver.findElement(By.xpath("(//form[@name='submenus']//following::input[1])[1]")).sendKeys("sNametest");
			
				/* Contact number */
			driver.findElement(By.xpath("(//form[@name='submenus']//following::input[1])[2]")).sendKeys("765432");
			
			/* Email */
			driver.findElement(By.xpath("(//form[@name='submenus']//following::input[1])[3]")).sendKeys("tesrst55@gmail.com");
			
			/*  Password */
			//driver.findElement(By.xpath("(//form[@name='submenus']//following::input[1])[5]")).sendKeys("Sadest345");
			driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Password");
			
			/* Gender */
			new Select(driver.findElement(By.xpath("//form[@name='submenus']//following::select[1]"))).selectByIndex(1);
			
			
			driver.findElement(By.xpath("//form[@name='submenus']//following::input[6]")).clear();
		
			/* Date */
			driver.findElement(By.xpath("//form[@name='submenus']//following::input[6]")).sendKeys("20-12-1976");
		
			/* checkbox */
			driver.findElement(By.xpath("//form[@name='submenus']//following::input[7]")).click();
			
			
			
			driver.findElement(By.xpath("//form[@name='submenus']//following::input[8]")).submit();
	}

}
