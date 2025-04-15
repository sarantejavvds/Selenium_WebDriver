package _012_Handling_Switch_Between_Multiple_Windows._1_getWindowHandle_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_getWindowHandle_function
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		String current_window_id = driver.getWindowHandle();
		System.out.println("current window id : " + current_window_id );

		
	}

}
