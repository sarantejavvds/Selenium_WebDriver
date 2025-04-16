package _013_WebDriver_Waits_for_Synchronization._1_Implicit_Wait_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Use_implicitWait_function 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toram.jp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); /* Selenium 3.141.59 */
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); /* Selenium 4.+ */
		/*Waits until selenium finds element, once element is found doesn't stop execution anymore */
		
		driver.findElement(By.linkText("LANGUAGE")).click();

	}

}
