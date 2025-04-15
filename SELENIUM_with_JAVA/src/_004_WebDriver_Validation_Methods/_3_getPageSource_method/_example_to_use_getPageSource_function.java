package _004_WebDriver_Validation_Methods._3_getPageSource_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_getPageSource_function 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		String page_Source = driver.getPageSource();
		
		System.out.println("HTML code of Webpage: " + page_Source);
		
		driver.close();
	}

}
