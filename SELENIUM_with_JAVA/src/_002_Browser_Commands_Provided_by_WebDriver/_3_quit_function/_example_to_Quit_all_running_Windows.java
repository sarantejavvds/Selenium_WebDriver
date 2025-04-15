package _002_Browser_Commands_Provided_by_WebDriver._3_quit_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_Quit_all_running_Windows 
{

	public _example_to_Quit_all_running_Windows() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");		
		driver.findElement(By.linkText("Help")).click();
		
		driver.quit();

	}

}
