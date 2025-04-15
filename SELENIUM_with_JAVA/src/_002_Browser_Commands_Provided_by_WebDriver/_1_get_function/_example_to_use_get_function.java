package _002_Browser_Commands_Provided_by_WebDriver._1_get_function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _example_to_use_get_function 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://google.com"); /* Takes into chrome browser and opens google home page */
		
		driver.get("http://mangadex.org/title/a2c1d849-af05-4bbc-b2a7-866ebb10331f/one-piece");

	}

}
