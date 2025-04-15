package _012_Handling_Switch_Between_Multiple_Windows._2_getWindowHandles_method;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_getWindowHandles_function
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Help")).click();
		Set<String> all_windows = driver.getWindowHandles();
		System.out.println("Set of Window Id: ");
		System.out.println(all_windows);

	}

}
