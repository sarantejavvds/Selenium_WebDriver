package _006_Locators_Available_in_Selenium.Using_Xpath_of_Element._with_help_of_Location._1_Absolute_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_Absolute_Xpath
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://flights.qedgetech.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("adabala.veeru1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qedge@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[3]/ul/li[2]/div/ul/li[5]/a")).click();
	}

}
