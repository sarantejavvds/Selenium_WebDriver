package _013_WebDriver_Waits_for_Synchronization._2_WebDriver_Wait_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _example_to_use_WebDriverWait_Class
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://flights.qedgetech.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.findElement(By.name("email")).sendKeys("adabala.veeru1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qedge@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.linkText("Flight Bookings")).click();
		driver.findElement(By.linkText("Delete")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		/* Wait until the condition for alert to visible become true */
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}
}
