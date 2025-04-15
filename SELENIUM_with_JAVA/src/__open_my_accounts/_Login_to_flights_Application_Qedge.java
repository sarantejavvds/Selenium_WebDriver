package __open_my_accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Login_to_flights_Application_Qedge
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
		
	}

}
