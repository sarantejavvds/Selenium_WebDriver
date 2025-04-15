package __open_my_accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _create_qedge_flights_account 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://flights.qedgetech.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("name")).sendKeys("SST");
		driver.findElement(By.id("contact")).sendKeys("0123456789");
		driver.findElement(By.id("email")).sendKeys("adabala.veeru1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qedge@123");
		driver.findElement(By.name("gender")).sendKeys("Male");
		driver.findElement(By.name("dob")).sendKeys("07-05-2000");
		driver.findElement(By.id("flexCheckChecked")).click();
		driver.findElement(By.name("submit")).click();

	}

}
