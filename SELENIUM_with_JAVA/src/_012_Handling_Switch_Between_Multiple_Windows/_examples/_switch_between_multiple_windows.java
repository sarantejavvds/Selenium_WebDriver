package _012_Handling_Switch_Between_Multiple_Windows._examples;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _switch_between_multiple_windows 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		// code to seperate window ids
		Object[] windows = allwindows.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		
		driver.switchTo().window(window2);
		driver.findElement(By.linkText("Google Account")).click();
		
		allwindows = driver.getWindowHandles();
		
		windows = allwindows.toArray();
		
		String window3 = windows[2].toString();
		
		driver.switchTo().window(window3);
		driver.findElement(By.linkText("Create an account")).click();

	}

}
