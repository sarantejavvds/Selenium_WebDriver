package _004_WebDriver_Validation_Methods._2_getCurrentUrl_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_getCurrentUrl_function 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		String page_current_URL = driver.getCurrentUrl();
		
		System.out.println("current URL of Webpage: " + page_current_URL);
		
		driver.close();
	}

}
