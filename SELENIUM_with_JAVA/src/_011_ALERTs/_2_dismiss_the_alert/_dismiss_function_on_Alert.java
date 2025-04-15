package _011_ALERTs._2_dismiss_the_alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _dismiss_function_on_Alert 
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
		
		String alert_message = driver.switchTo().alert().getText();
		System.out.println();
		System.out.println("Alert message : "+alert_message);
		
		driver.switchTo().alert().dismiss();
	}

}
